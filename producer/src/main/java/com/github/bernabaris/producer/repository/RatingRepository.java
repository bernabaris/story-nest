package com.github.bernabaris.producer.repository;

import com.github.bernabaris.producer.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
}
