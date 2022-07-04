package com.example.reviewinfo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ReviewTarget {

    @Column(name = "REVIEWTARGET_ID", nullable = false)
    private Long reviewTargetId;

    @Column(name = "CARPOOL_ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private CarpoolRole carpoolRole;

}