package com.github.bernabaris.producer.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private Long id;
    private String name;
    private Integer releaseYear;
    private String story;
    private String base64Img;

    private Genre genre;
    private Language language;

    private User createdBy;

    private boolean active;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Rating rating;
    private List<Review> reviews;
}
