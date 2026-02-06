package com.github.bernabaris.backend.service;

import com.github.bernabaris.backend.dto.request.ReviewCreateRequest;
import com.github.bernabaris.backend.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviewsByMovie(Long movieId);

    Review createReview(ReviewCreateRequest request);
}
