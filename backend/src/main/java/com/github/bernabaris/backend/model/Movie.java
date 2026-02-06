package com.github.bernabaris.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

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
