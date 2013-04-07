/**
 * Copyright (c) 2012, BodyMedia Inc. All Rights Reserved
 *
 *   $HeadURL$
 *   $Rev$
 *   $Date$
 *   $Author$
 */
package org.storyspace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.storyspace.model.Feed;
import org.storyspace.model.StorySnippet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/feed")
@Produces({ MediaType.APPLICATION_JSON })
public class FeedResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeedResource.class);

    @Autowired
    private StoryService storyService;

    @GET
    @Path("/{location}")
    public Feed getFeed(@PathParam("location") int location) {
        List<StorySnippet> stories = storyService.getStories(location, StorySnippet.Privacy.PUBLIC);
        return new Feed(stories);
    }

}
