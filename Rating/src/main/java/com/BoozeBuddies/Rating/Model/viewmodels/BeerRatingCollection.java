package com.BoozeBuddies.Rating.Model.viewmodels;

import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRating;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;

import java.util.List;

public class BeerRatingCollection {
    private List<BeerRatingScam> beerRatings;

    public BeerRatingCollection() {
    }

    public List<BeerRatingScam> getBeerRatings() {
        return beerRatings;
    }

    public void setBeerRatings(List<BeerRatingScam> beerRatings) {
        this.beerRatings = beerRatings;
    }
}
