package com.github.bernabaris.producer.service;

import com.github.bernabaris.producer.dto.request.MovieCreateRequest;
import com.github.bernabaris.producer.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    Movie createMovie(MovieCreateRequest request);
}
