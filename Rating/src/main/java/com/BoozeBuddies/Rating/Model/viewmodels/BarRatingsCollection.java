package com.BoozeBuddies.Rating.Model.viewmodels;

import com.BoozeBuddies.Rating.Model.entities.BarRating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;

import java.util.List;

public class BarRatingsCollection {
    private List<BarRatingScam> barRatings;

    public BarRatingsCollection() {
    }

    public List<BarRatingScam> getBarRatings() {
        return barRatings;
    }

    public void setBarRatings(List<BarRatingScam> barRatings) {
        this.barRatings = barRatings;
    }
}

