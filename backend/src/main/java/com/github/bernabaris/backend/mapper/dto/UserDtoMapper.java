package com.github.bernabaris.backend.mapper.dto;

import com.github.bernabaris.backend.dto.response.UserResponse;
import com.github.bernabaris.backend.model.User;

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
