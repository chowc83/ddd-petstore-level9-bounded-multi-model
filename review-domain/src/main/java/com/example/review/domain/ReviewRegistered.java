package carpoolreview.domain;


public class ReviewRegistered extends Review {

    private Long id;
    private Reviewer reviewer;
    private ReviewType reviewType;
    private ReviewTarget reviewTarget;
    private ReviewScore reviewScore;
    private String comment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public ReviewType getReviewType() {
        return reviewType;
    }

    public void setReviewType(ReviewType reviewType) {
        this.reviewType = reviewType;
    }

    public ReviewTarget getReviewTarget() {
        return reviewTarget;
    }

    public void setReviewTarget(ReviewTarget reviewTarget) {
        this.reviewTarget = reviewTarget;
    }

    public ReviewScore getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(ReviewScore reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void publishAfftercommit() {
    }


}
