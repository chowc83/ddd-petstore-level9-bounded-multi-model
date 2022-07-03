package com.example.reviewinfo.domain;

import javax.persistence.Embeddable;


@Embeddable

public class ReviewTarget {

    private Long reviewTargetId;

    private String reviewTargetNm;

    public Long getReviewTargetId() {
        return reviewTargetId;
    }

    public void setReviewTargetId(Long reviewTargetId) {
        this.reviewTargetId = reviewTargetId;
    }

    public String getReviewTargetNm() {
        return reviewTargetNm;
    }

    public void setReviewTargetNm(String reviewTargetNm) {
        this.reviewTargetNm = reviewTargetNm;
    }
}
