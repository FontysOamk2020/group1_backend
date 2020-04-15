package com.BoozeBuddies.Rating.Dal.Context;

import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.UserRatings;



public class RatingContextMySql implements IRatingContext {


    @Override
    public BarRatingsCollection GetBarRatingAverage(int BarId) {
        return null;
    }

    @Override
    public BeerRatingCollection GetBeerRatingAverage(int BeerId) {
        return null;
    }

    @Override
    public UserRatings GetAllUserRatings(int userId) {
        return null;
    }

    @Override
    public Object AddBarRating(Rating rating) {
        return null;
    }

    @Override
    public Object AddBeerRating(Rating rating) {
        return null;
    }

    @Override
    public BarRatingScam EditRatingBar(BarRatingScam barRatingScam) {
        return null;
    }

    @Override
    public BeerRatingScam EditRatingBeer(BeerRatingScam beerRatingScam) {
        return null;
    }

    @Override
    public BarRatingScam DeleteRatingBar(BarRatingScam barRatingScam) {
        return null;
    }

    @Override
    public BeerRatingScam DeleteRatingBeer(BeerRatingScam beerRatingScam) {
        return null;
    }
}
