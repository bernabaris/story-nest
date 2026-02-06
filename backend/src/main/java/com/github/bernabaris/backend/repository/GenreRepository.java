package com.github.bernabaris.backend.repository;

import com.github.bernabaris.backend.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
