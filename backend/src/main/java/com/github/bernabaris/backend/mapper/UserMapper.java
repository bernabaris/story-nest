package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.UserEntity;
import com.github.bernabaris.backend.model.User;

public class UserMapper {
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
