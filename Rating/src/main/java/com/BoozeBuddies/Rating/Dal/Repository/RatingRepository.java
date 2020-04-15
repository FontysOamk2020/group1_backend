package com.BoozeBuddies.Rating.Dal.Repository;


import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.UserRatings;

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
    public UserRatings GetAllUserRatings(int userId) {
        return context.GetAllUserRatings(userId);
    }

    @Override
    public Object AddBarRating(Rating rating) {
        return context.AddBarRating(rating);
    }

    @Override
    public Object AddBeerRating(Rating rating) {
        return context.AddBeerRating(rating);
    }

    @Override
    public BarRatingScam EditRatingBar(BarRatingScam barRatingScam) {
        return context.EditRatingBar(barRatingScam);
    }

    @Override
    public BeerRatingScam EditRatingBeer(BeerRatingScam beerRatingScam) {
        return context.EditRatingBeer(beerRatingScam);
    }

    @Override
    public BarRatingScam DeleteRatingBar(BarRatingScam barRatingScam) {
        return context.DeleteRatingBar(barRatingScam);
    }

    @Override
    public BeerRatingScam DeleteRatingBeer(BeerRatingScam beerRatingScam) {
        return context.DeleteRatingBeer(beerRatingScam);
    }
}
