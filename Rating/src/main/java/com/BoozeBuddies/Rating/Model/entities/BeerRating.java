package com.BoozeBuddies.Rating.Model.entities;

import com.BoozeBuddies.Rating.Model.Rating;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "beer_rating")
public class BeerRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId("user_id")
    private User userId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId("beer_id")
    private Beer beerId;

    @Column(name = "rating", nullable = false)
    private double rating;

    public BeerRating() {
    }

    public BeerRating(Rating rating) {
        this.beerId = new Beer();
        beerId.setId(rating.getObjectId());

        this.userId = new User();
        userId.setId(rating.getUserId());

        this.rating = rating.getObjectRating();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Beer getBeerId() {
        return beerId;
    }

    public void setBeerId(Beer beerId) {
        this.beerId = beerId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
