package carpoolreview.domain;


import javax.persistence.*;


@Embeddable

public class Reviewer {

    private Long reviewerId;
    private String reviewerNm;

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerNm() {
        return reviewerNm;
    }

    public void setReviewerNm(String reviewerNm) {
        this.reviewerNm = reviewerNm;
    }


}
