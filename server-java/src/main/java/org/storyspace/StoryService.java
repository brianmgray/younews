package org.storyspace;

import org.springframework.stereotype.Service;
import org.storyspace.model.Story;
import org.storyspace.model.StorySnippet;

import java.util.List;

import static com.google.common.collect.Lists.*;

/** @author bgray */
@Service
public class StoryService {

    public Long saveStory(Story story) {
        return new Long(1234);
    }

    public Story getStory(long id) {
        return new Story("It Could Have Happened To Anyone", 15222, StorySnippet.Privacy.PUBLIC,
                "This is my story...", "This is my story. It can be long. It can also contain <strong>html</strong>",
                newArrayList("http://feeds.themoth" +
                        ".org/~r/themothpodcast/~5/rzQ00FhC99E/moth-podcast-270-wayne-reece.mp3"));

    }

    public List<StorySnippet> getStories(int zip, Story.Privacy privacy) {
        return newArrayList(
                new StorySnippet("A walk on the West Side", 15217, StorySnippet.Privacy.PUBLIC,
                        "This is my story. It can be long. It can also contain <strong>html</strong>"),
                new StorySnippet("It Could Have Happened To Anyone", 15222, StorySnippet.Privacy.PUBLIC,
                        "This is my story. It can be long. It can also contain <strong>html</strong>")
        );
    }

}
