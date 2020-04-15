package com.BoozeBuddies.Rating.Model.viewmodels;

import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;

import java.util.List;

public class UserRatings {
    int userId;
    List<BeerRatingScam> beerRatings;
    List<BarRatingScam> barRatings;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<BeerRatingScam> getBeerRatings() {
        return beerRatings;
    }

    public void setBeerRatings(List<BeerRatingScam> beerRatings) {
        this.beerRatings = beerRatings;
    }

    public List<BarRatingScam> getBarRatings() {
        return barRatings;
    }

    public void setBarRatings(List<BarRatingScam> barRatings) {
        this.barRatings = barRatings;
    }

    public UserRatings() {
    }

    public UserRatings(int userId, List<BeerRatingScam> beerRatings, List<BarRatingScam> barRatings) {
        this.userId = userId;
        this.beerRatings = beerRatings;
        this.barRatings = barRatings;
    }
}
