package com.github.bernabaris.producer.repository;

import com.github.bernabaris.producer.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
