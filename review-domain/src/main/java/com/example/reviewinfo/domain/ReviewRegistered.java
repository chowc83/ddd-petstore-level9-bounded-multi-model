package com.example.reviewinfo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ReviewRegistered {

    private Long reviewerId;
    private Long reviewTargetId;
    private CarpoolRole carpoolRole;
    private ReviewScore reviewScore;
    private String comment;
    
}