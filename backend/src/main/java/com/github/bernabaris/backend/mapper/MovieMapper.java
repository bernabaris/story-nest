package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.MovieEntity;
import com.github.bernabaris.backend.model.Movie;

import java.util.stream.Collectors;

public class MovieMapper {

    private MovieMapper() {}

    public static Movie toModel(MovieEntity entity) {
        if (entity == null) return null;

        Movie movie = new Movie();
        movie.setId(entity.getId());
        movie.setName(entity.getName());
        movie.setReleaseYear(entity.getReleaseYear());
        movie.setStory(entity.getStory());
        movie.setBase64Img(entity.getBase64Img());

        movie.setGenre(GenreMapper.toModel(entity.getGenre()));
        movie.setLanguage(LanguageMapper.toModel(entity.getLanguage()));

        movie.setActive(entity.isActive());
        movie.setCreatedAt(entity.getCreatedAt());

        movie.setRating(RatingMapper.toModel(entity.getRating()));

        movie.setReviews(
                entity.getReviews() == null
                        ? null
                        : entity.getReviews()
                        .stream()
                        .map(ReviewMapper::toModel)
                        .collect(Collectors.toList())
        );

        return movie;
    }
}
