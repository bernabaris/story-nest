package com.github.bernabaris.producer.mapper.entity;

import com.github.bernabaris.producer.entity.ReviewEntity;
import com.github.bernabaris.producer.mapper.UserMapper;
import com.github.bernabaris.producer.model.Review;
import com.github.bernabaris.producer.model.User;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ReviewEntityMapper {

    private ReviewEntityMapper() {
    }

    public static Review toModel(ReviewEntity entity) {
        if (entity == null) return null;

        return new Review(
                entity.getId(),
                null,


                UserMapper.toModel(entity.getUser()),
                entity.getRating(),
                entity.getComment(),
                entity.getCreatedAt()
        );
    }

    // ----------------------------------

    private static User mapUser(ReviewEntity entity) {
        if (entity.getUser() == null) return null;

        return new User(
                entity.getUser().getId(),
                entity.getUser().getFirstName(),
                entity.getUser().getLastName()
        );
    }

    private static LocalDateTime toLocalDateTime(java.util.Date date) {
        if (date == null) return null;

        return LocalDateTime.ofInstant(
                date.toInstant(),
                ZoneId.systemDefault()
        );
    }
}
