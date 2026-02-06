package com.github.bernabaris.backend.controller;

import com.github.bernabaris.backend.dto.request.MovieCreateRequest;
import com.github.bernabaris.backend.dto.response.MovieResponse;
import com.github.bernabaris.backend.mapper.dto.MovieDtoMapper;
import com.github.bernabaris.backend.model.Movie;
import com.github.bernabaris.backend.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    // 🎯 1️⃣ Tüm filmleri getir
    @GetMapping
    public List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies()
                .stream()
                .map(MovieDtoMapper::toResponse)
                .toList();
    }

    // 🎯 2️⃣ ID ile film getir
    @GetMapping("/{id}")
    public MovieResponse getMovieById(@PathVariable Long id) {
        Movie movie = movieService.getMovieById(id);
        return MovieDtoMapper.toResponse(movie);
    }

    // 🎯 3️⃣ Yeni film ekle
    @PostMapping
    public MovieResponse createMovie(@RequestBody MovieCreateRequest request) {

        Movie movie = movieService.createMovie(request);

        return MovieDtoMapper.toResponse(movie);
    }
}
