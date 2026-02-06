package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.RatingEntity;
import com.github.bernabaris.backend.model.Rating;

public class RatingMapper {
    public static Rating toModel(RatingEntity entity) {
        if (entity == null) return null;

        return new Rating(
                entity.getAverageRating(),
                entity.getTotalReviews()
        );
    }
}
