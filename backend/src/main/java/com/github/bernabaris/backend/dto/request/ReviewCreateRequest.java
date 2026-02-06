package com.github.bernabaris.backend.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewCreateRequest {
    private Long movieId;
    private Long userId;
    private Double rating;
    private String comment;
}
