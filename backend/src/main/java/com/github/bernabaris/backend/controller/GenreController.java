package com.github.bernabaris.backend.controller;

import com.github.bernabaris.backend.entity.GenreEntity;
import com.github.bernabaris.backend.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreRepository genreRepository;

    @GetMapping
    public List<GenreEntity> getAllGenres() {
        return genreRepository.findAll();
    }
}
