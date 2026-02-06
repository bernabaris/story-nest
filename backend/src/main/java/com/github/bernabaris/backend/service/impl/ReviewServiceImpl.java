package com.github.bernabaris.backend.service.impl;

import com.github.bernabaris.backend.dto.request.ReviewCreateRequest;
import com.github.bernabaris.backend.entity.MovieEntity;
import com.github.bernabaris.backend.entity.ReviewEntity;
import com.github.bernabaris.backend.entity.UserEntity;
import com.github.bernabaris.backend.mapper.ReviewMapper;
import com.github.bernabaris.backend.model.Review;
import com.github.bernabaris.backend.repository.MovieRepository;
import com.github.bernabaris.backend.repository.ReviewRepository;
import com.github.bernabaris.backend.repository.UserRepository;
import com.github.bernabaris.backend.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    @Override
    public List<Review> getReviewsByMovie(Long movieId) {
        return reviewRepository.findByMovieId(movieId).stream()
                .map(ReviewMapper::toModel)
                .toList();
    }

    @Override
    public Review createReview(ReviewCreateRequest request) {

        MovieEntity movie = movieRepository.findById(request.getMovieId())
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        UserEntity user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        ReviewEntity entity = new ReviewEntity();
        entity.setMovie(movie);
        entity.setUser(user);
        entity.setComment(request.getComment());
        entity.setRating(request.getRating());

        ReviewEntity saved = reviewRepository.save(entity);

        return ReviewMapper.toModel(saved);
    }
}
