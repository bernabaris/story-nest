package com.github.bernabaris.producer.mapper.entity;

import com.github.bernabaris.producer.entity.GenreEntity;
import com.github.bernabaris.producer.model.Genre;

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
