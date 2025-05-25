package com.github.bernabaris.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private Long movieId;
    private Integer likes;
    private Integer dislikes;
    private Double value;
    private Integer totalRating;
}
