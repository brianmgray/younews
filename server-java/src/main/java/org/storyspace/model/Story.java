package org.storyspace.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/** @author bgray */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class Story extends StorySnippet {

    public Story(String headline, int location, Privacy privacy, String storySnippet, String story,
                 List<String> links) {
        super(headline, location, privacy, storySnippet);
        this.links = links;
        this.story = story;
    }

    private List<String> links;
    private String story;

}
