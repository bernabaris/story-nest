package com.github.bernabaris.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReviewResponse {
    private Long id;
    private Long movieId;
    private Long userId;
    private String userFullName;
    private Double rating;
    private String comment;
    private LocalDateTime createdAt;
}
