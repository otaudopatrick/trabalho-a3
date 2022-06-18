package com.trabalhoa3.delivery.domain.entities;

public class Rating {
    private float stars;
    private String reason;

    public Rating(float stars, String reason) {
        this.stars = stars;
        this.reason = reason;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
