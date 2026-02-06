package com.github.bernabaris.backend.repository;

import com.github.bernabaris.backend.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
}
