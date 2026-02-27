package com.github.bernabaris.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private Long id;
    private Movie movie;
    private User user;
    private Double rating;
    private String comment;
    private LocalDateTime createdAt;
}
