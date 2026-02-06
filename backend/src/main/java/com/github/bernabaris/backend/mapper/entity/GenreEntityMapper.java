package com.github.bernabaris.backend.mapper.entity;

import com.github.bernabaris.backend.entity.GenreEntity;
import com.github.bernabaris.backend.model.Genre;

public class GenreEntityMapper {

    private GenreEntityMapper() {
    }

    public static Genre toModel(GenreEntity entity) {
        if (entity == null) return null;

        return new Genre(
                entity.getId(),
                entity.getName()
        );
    }
}
