package com.BoozeBuddies.Rating.Model.viewmodels;

import com.BoozeBuddies.Rating.Model.entities.BeerRating;

import java.util.List;

public class BeerRatingCollection {
    private List<BeerRating> beerRatings;

    public BeerRatingCollection() {
    }

    public List<BeerRating> getBeerRatings() {
        return beerRatings;
    }

    public void setBeerRatings(List<BeerRating> beerRatings) {
        this.beerRatings = beerRatings;
    }
}
