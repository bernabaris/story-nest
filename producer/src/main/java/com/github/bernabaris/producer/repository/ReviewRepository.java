package com.github.bernabaris.producer.repository;

import com.github.bernabaris.producer.entity.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {

    List<ReviewEntity> findByMovieId(Long movieId);

    boolean existsByMovieIdAndUserId(Long movieId, Long userId);
}
