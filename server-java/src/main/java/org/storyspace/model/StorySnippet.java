package org.storyspace.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/** @author bgray */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class StorySnippet {

    public static enum Privacy {
        PUBLIC, PRIVATE;
    }

    private int id;
    @NonNull private String headline;
    @NonNull private int location; // zip code
    @NonNull private Privacy privacy;
    @NonNull private String storySnippet;

}
