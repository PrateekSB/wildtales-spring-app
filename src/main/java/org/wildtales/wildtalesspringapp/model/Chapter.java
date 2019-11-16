package org.wildtales.wildtalesspringapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    private String title;
    private int order;
    private String story;
    private List<String> imageUrls;
    private List<String> videoUrls;
}
