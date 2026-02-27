package com.github.bernabaris.producer.mapper.dto;

import com.github.bernabaris.producer.dto.response.MovieResponse;
import com.github.bernabaris.producer.model.Movie;

import java.util.stream.Collectors;

public class MovieDtoMapper {

    private MovieDtoMapper() {}

    public static MovieResponse toResponse(Movie movie) {
        if (movie == null) return null;

        return new MovieResponse(
                movie.getId(),
                movie.getName(),
                movie.getReleaseYear(),
                movie.getStory(),
                movie.getBase64Img(),

                movie.getGenre() != null ? movie.getGenre().getName() : null,
                movie.getLanguage() != null ? movie.getLanguage().getName() : null,

                movie.getRating() != null ? movie.getRating().getAverageRating() : 0.0,
                movie.getRating() != null ? movie.getRating().getTotalReviews() : 0,

                movie.isActive(),
                movie.getCreatedAt(),

                movie.getReviews() == null ? null :
                        movie.getReviews()
                                .stream()
                                .map(ReviewDtoMapper::toResponse)
                                .collect(Collectors.toList())
        );
    }
}
