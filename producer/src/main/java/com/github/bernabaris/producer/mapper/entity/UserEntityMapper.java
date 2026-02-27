package com.github.bernabaris.producer.mapper.entity;

import com.github.bernabaris.producer.entity.UserEntity;
import com.github.bernabaris.producer.model.User;

public class UserEntityMapper {

    private UserEntityMapper() {
    }

    public static User toModel(UserEntity entity) {
        if (entity == null) return null;

        return new User(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.isAdmin(),
                entity.isActive(),
                entity.getCreatedAt()
        );
    }
}
