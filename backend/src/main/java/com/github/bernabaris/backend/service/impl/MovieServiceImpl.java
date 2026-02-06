package com.github.bernabaris.backend.service.impl;

import com.github.bernabaris.backend.dto.request.MovieCreateRequest;
import com.github.bernabaris.backend.entity.GenreEntity;
import com.github.bernabaris.backend.entity.LanguageEntity;
import com.github.bernabaris.backend.entity.MovieEntity;
import com.github.bernabaris.backend.mapper.MovieMapper;
import com.github.bernabaris.backend.model.Movie;
import com.github.bernabaris.backend.repository.GenreRepository;
import com.github.bernabaris.backend.repository.LanguageRepository;
import com.github.bernabaris.backend.repository.MovieRepository;
import com.github.bernabaris.backend.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;
    private final LanguageRepository languageRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(MovieMapper::toModel)
                .toList();
    }

    @Override
    public Movie getMovieById(Long id) {
        MovieEntity entity = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        return MovieMapper.toModel(entity);
    }

    @Override
    public Movie createMovie(MovieCreateRequest request) {

        GenreEntity genre = genreRepository.findById(request.getGenreId())
                .orElseThrow(() -> new RuntimeException("Genre not found"));

        LanguageEntity language = languageRepository.findById(request.getLanguageId())
                .orElseThrow(() -> new RuntimeException("Language not found"));

        MovieEntity entity = new MovieEntity();
        entity.setName(request.getName());
        entity.setReleaseYear(request.getReleaseYear());
        entity.setStory(request.getStory());
        entity.setBase64Img(request.getBase64Img());
        entity.setGenre(genre);
        entity.setLanguage(language);
        entity.setActive(true);
        entity.setCreatedAt(LocalDateTime.now());

        MovieEntity saved = movieRepository.save(entity);

        return MovieMapper.toModel(saved);
    }
}
