package com.example.reviewinfo.domain;

import com.example.reviewinfo.ReviewApplication;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Review_table")

public class Review {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    @Column(name = "REVIEWER_ID", nullable = false)
    private Long reviewerId;

    @Embedded
    private ReviewTarget reviewTarget;

    @Column(name = "REVIEW_SCORE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ReviewScore reviewScore;

    @Column(name = "COMMENT", nullable = false)
    private String comment;


    @PostPersist
    public void onPostPersist() {
        ReviewRegistered reviewRegistered = new ReviewRegistered(this);
        reviewRegistered.publishAfftercommit();
    }

    public static ReviewRepository repository() {
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(
            ReviewRepository.class
        );
        return reviewRepository;
    }
}
