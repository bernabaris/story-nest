package com.github.bernabaris.producer.controller;

import com.github.bernabaris.producer.entity.GenreEntity;
import com.github.bernabaris.producer.repository.GenreRepository;
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
