package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.GenreEntity;
import com.github.bernabaris.backend.model.Genre;

public class GenreMapper {
    public static Genre toModel(GenreEntity entity) {
        if (entity == null) return null;

        return new Genre(
                entity.getId(),
                entity.getName()
        );
    }
}
