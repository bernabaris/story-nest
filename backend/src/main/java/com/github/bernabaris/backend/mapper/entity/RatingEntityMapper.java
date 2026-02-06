package com.github.bernabaris.backend.mapper.entity;

import com.github.bernabaris.backend.entity.RatingEntity;
import com.github.bernabaris.backend.model.Rating;

public class RatingEntityMapper {

    private RatingEntityMapper() {}

    public static Rating toModel(RatingEntity entity) {
        if (entity == null) return null;

        return new Rating(
                entity.getAverageRating(),
                entity.getTotalReviews()
        );
    }
}
