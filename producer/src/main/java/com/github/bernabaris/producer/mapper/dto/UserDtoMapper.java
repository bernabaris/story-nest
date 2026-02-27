package com.github.bernabaris.producer.mapper.dto;

import com.github.bernabaris.producer.dto.response.UserResponse;
import com.github.bernabaris.producer.model.User;

public class UserDtoMapper {

    private UserDtoMapper() {}

    public static UserResponse toResponse(User user) {
        if (user == null) return null;

        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName()
        );
    }
}
