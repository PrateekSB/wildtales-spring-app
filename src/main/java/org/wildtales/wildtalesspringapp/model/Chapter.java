package org.wildtales.wildtalesspringapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    private String title;
    private int order;
    private String story;
    private String imageUrl;
    private String videoUrl;
}
