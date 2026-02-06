package com.github.bernabaris.backend.mapper.entity;

import com.github.bernabaris.backend.entity.UserEntity;
import com.github.bernabaris.backend.model.User;

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
