package com.BoozeBuddies.Rating.Logic;


import com.BoozeBuddies.Rating.Factory.RatingFactory;
import com.BoozeBuddies.Rating.Interface.IRatingRepo;

import com.BoozeBuddies.Rating.Model.Rating;
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
}
