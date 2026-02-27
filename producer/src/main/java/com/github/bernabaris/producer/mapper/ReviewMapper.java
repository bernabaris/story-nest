package com.github.bernabaris.producer.mapper;

import com.github.bernabaris.producer.entity.ReviewEntity;
import com.github.bernabaris.producer.model.Review;

public class ReviewMapper {
    public static Review toModel(ReviewEntity entity) {
        if (entity == null) return null;

        return new Review(
                entity.getId(),
                MovieMapper.toModel(entity.getMovie()),
                UserMapper.toModel(entity.getUser()),
                entity.getRating(),
                entity.getComment(),
                entity.getCreatedAt()
        );
    }
}
