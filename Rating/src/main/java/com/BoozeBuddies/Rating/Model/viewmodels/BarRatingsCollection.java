package com.BoozeBuddies.Rating.Model.viewmodels;

import com.BoozeBuddies.Rating.Model.entities.BarRating;

import java.util.List;

public class BarRatingsCollection {
    private List<BarRating> barRatings;

    public BarRatingsCollection() {
    }

    public List<BarRating> getBarRatings() {
        return barRatings;
    }

    public void setBarRatings(List<BarRating> barRatings) {
        this.barRatings = barRatings;
    }
}

