package com.BoozeBuddies.Rating.Dal.Repository;


import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;

public class RatingRepository implements IRatingContext {
    private IRatingContext context;

    public RatingRepository(IRatingContext context) {
        this.context = context;
    }

    @Override
    public BarRatingsCollection GetBarRatingAverage(int BarId) {
        return context.GetBarRatingAverage(BarId);
    }

    @Override
    public BeerRatingCollection GetBeerRatingAverage(int BeerId) {
        return context.GetBeerRatingAverage(BeerId);
    }

    @Override
    public Object AddRating(Object rating) {
        return null;
    }
}
