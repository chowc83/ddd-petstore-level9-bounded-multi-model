package com.example.reviewinfo.domain;

import com.example.reviewinfo.domain.review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {}
