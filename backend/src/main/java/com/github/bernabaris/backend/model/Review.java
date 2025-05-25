package com.github.bernabaris.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private Long id;
    private Long movieId;
    private Long userId;
    private String username;
    private boolean liked;
    private String comment;
    private Double rating;
    private Date created;
}
