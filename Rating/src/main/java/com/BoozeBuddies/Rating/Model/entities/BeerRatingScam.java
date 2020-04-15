package com.BoozeBuddies.Rating.Model.entities;

import com.BoozeBuddies.Rating.Model.Rating;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "beer_rating")
public class BeerRatingScam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @JsonIgnore
    @Column(name = "user_id")
    private int userId;

    @JsonIgnore
    @Column(name = "beer_id")
    private int beerId;

    @Column(name = "rating", nullable = false)
    private double rating;

    public BeerRatingScam() {
    }

    public BeerRatingScam(Rating rating) {
        this.beerId = rating.getObjectId();
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

    public int getBeerId() {
        return beerId;
    }

    public void setBeerId(int beerId) {
        this.beerId = beerId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
