package com.github.bernabaris.backend.mapper.dto;

import com.github.bernabaris.backend.dto.response.ReviewResponse;
import com.github.bernabaris.backend.model.Review;

public class ReviewDtoMapper {

    public static ReviewResponse toResponse(Review model) {
        if (model == null) return null;

        return new ReviewResponse(
                model.getId(),
                model.getMovie().getId(),
                model.getUser().getId(),
                model.getUser().getFirstName() + " " + model.getUser().getLastName(),
                model.getRating(),
                model.getComment(),
                model.getCreatedAt()
        );
    }
}
