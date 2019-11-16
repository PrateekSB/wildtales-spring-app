package org.wildtales.wildtalesspringapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.wildtales.wildtalesspringapp.model.Chapter;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaleDTO {
    private String author;
    private List<Chapter> chapters;
}
