package com.github.bernabaris.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private Long id;
    private String name;
    private Integer releaseYear;
    private String story;
    private String base64Img;
    private Long languageId;
    private Long genreId;
    private String createdBy;
    private boolean active;
    private Date created;
    private Date updated;
    private String genre;
    private String language;
    private Rating rating;
    private List<Review> reviews;
}
