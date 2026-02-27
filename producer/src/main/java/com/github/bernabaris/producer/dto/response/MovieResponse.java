package com.github.bernabaris.producer.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class MovieResponse {

    private Long id;
    private String name;
    private Integer releaseYear;
    private String story;
    private String base64Img;

    private String genre;
    private String language;

    private Double averageRating;
    private Integer totalReviews;

    private boolean active;
    private LocalDateTime createdAt;

    private List<ReviewResponse> reviews;
}
