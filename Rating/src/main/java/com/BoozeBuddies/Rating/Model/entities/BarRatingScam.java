package com.BoozeBuddies.Rating.Model.entities;

import com.BoozeBuddies.Rating.Model.Rating;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bar_rating")
public class BarRatingScam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "bar_id")
    private int barId;

    @Column(name = "rating", nullable = false)
    private double rating;

    public BarRatingScam() {
    }

    public BarRatingScam(Rating rating) {
        this.barId = rating.getObjectId();
        this.userId = rating.getUserId();
        this.rating = rating.getObjectRating();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBarId() {
        return barId;
    }

    public void setBarId(int barId) {
        this.barId = barId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
