package com.BoozeBuddies.Rating.Dal.Context;

import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;

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
    public Object AddRating(Object object) {
        return null;
    }
}
