package com.github.bernabaris.backend.repository;

import com.github.bernabaris.backend.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    Optional<MovieEntity> findByNameAndReleaseYear(String name, int releaseYear);
}
