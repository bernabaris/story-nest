package com.github.bernabaris.backend.mapper.entity;

import com.github.bernabaris.backend.entity.MovieEntity;
import com.github.bernabaris.backend.model.Movie;

import java.util.stream.Collectors;

public class MovieEntityMapper {

    private MovieEntityMapper() {}

    public static Movie toModel(MovieEntity entity) {
        if (entity == null) return null;

        return new Movie(
                entity.getId(),
                entity.getName(),
                entity.getReleaseYear(),
                entity.getStory(),
                entity.getBase64Img(),
                GenreEntityMapper.toModel(entity.getGenre()),
                LanguageEntityMapper.toModel(entity.getLanguage()),
                UserEntityMapper.toModel(entity.getCreatedBy()),
                entity.isActive(),
                entity.getCreatedAt(),
                entity.getUpdatedAt(),
                entity.getRating() != null ? RatingEntityMapper.toModel(entity.getRating()) : null,
                entity.getReviews() != null
                        ? entity.getReviews().stream()
                        .map(ReviewEntityMapper::toModel)
                        .collect(Collectors.toList())
                        : null
        );
    }
}
