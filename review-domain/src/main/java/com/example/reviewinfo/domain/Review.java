package com.example.reviewinfo.domain;

import org.springframework.beans.BeanUtils;

import com.example.reviewinfo.ReviewApplication;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Review_table")

public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    public Long getId() {
        return id;
    }
    
    @Embedded
    private Reviewer reviewer;

    @Enumerated(EnumType.STRING)
    private ReviewType reviewType;

    @Embedded
    private ReviewTarget reviewTarget;
 
    @Enumerated(EnumType.STRING)
    private ReviewScore reviewScore;

    //private String comment;




    @PostPersist
    public void onPostPersist() {
        ReviewRegistered reviewRegistered = new ReviewRegistered();
        reviewRegistered.setId(this.getId());
        reviewRegistered.publishAfftercommit();
    }

    public static ReviewRepository repository() {
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(
            ReviewRepository.class
        );
        return reviewRepository;
    }
}
