package com.github.bernabaris.backend.service;

import com.github.bernabaris.backend.dto.request.MovieCreateRequest;
import com.github.bernabaris.backend.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    Movie createMovie(MovieCreateRequest request);
}
