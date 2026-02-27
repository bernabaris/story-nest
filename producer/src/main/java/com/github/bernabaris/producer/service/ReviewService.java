package com.github.bernabaris.producer.service;

import com.github.bernabaris.producer.dto.request.ReviewCreateRequest;
import com.github.bernabaris.producer.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviewsByMovie(Long movieId);

    Review createReview(ReviewCreateRequest request);
}
