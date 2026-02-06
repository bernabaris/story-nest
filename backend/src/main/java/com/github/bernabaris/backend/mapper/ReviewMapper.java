package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.ReviewEntity;
import com.github.bernabaris.backend.model.Review;

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
