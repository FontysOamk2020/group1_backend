package com.BoozeBuddies.Rating.Logic;


import com.BoozeBuddies.Rating.Factory.RatingFactory;
import com.BoozeBuddies.Rating.Interface.IRatingRepo;

import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import org.springframework.lang.Nullable;

public class RatingLogic {
    private RatingFactory ratingFactory = new RatingFactory();
    private IRatingRepo context = ratingFactory.createBarRepoHibernate();

    public RatingLogic(@Nullable IRatingRepo repo)
    {
        context = ((repo == null) ? ratingFactory.createBarRepoHibernate() : repo);
    }

    public Object AddBarRating(Rating rating) {
        return context.AddBarRating(rating);
    }

    public Object AddBeerRating(Rating rating) {
        return context.AddBeerRating(rating);
    }

    public BeerRatingScam EditBeerRating(BeerRatingScam beerRatingScam) {
        return context.EditRatingBeer(beerRatingScam);
    }

    public BarRatingScam EditBarRating(BarRatingScam barRatingScam) {
        return context.EditRatingBar(barRatingScam);
    }

    public BeerRatingScam DeleteBeerRating(BeerRatingScam beerRatingScam) {
        return context.DeleteRatingBeer(beerRatingScam);
    }

    public BarRatingScam DeleteBarRating(BarRatingScam barRatingScam) {
        return context.DeleteRatingBar(barRatingScam);
    }
}
