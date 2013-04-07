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
import org.storyspace.model.Story;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@Path("/story")
@Produces({ MediaType.APPLICATION_JSON })
public class StoryResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(StoryResource.class);

    @Autowired
    private StoryService storyService;

    @POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response saveStory(Story story) {
        Long id = storyService.saveStory(story);
        return Response.ok(id).build();
    }

    @GET
    @Path("/{id}")
    public Story getStory(@PathParam("id") long id) {
        Story story = storyService.getStory(id);
        return story;
    }

}
