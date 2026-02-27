package com.github.bernabaris.producer.mapper;

import com.github.bernabaris.producer.entity.RatingEntity;
import com.github.bernabaris.producer.model.Rating;

public class RatingMapper {
    public static Rating toModel(RatingEntity entity) {
        if (entity == null) return null;

        return new Rating(
                entity.getAverageRating(),
                entity.getTotalReviews()
        );
    }
}
