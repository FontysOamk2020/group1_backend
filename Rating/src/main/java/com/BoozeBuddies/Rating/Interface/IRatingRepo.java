package com.BoozeBuddies.Rating.Interface;


import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;

public interface IRatingRepo {
    Object AddBarRating(Rating rating);
    Object AddBeerRating(Rating rating);
    BarRatingScam EditRatingBar(BarRatingScam barRatingScam);
    BeerRatingScam EditRatingBeer(BeerRatingScam beerRatingScam);
    BarRatingScam DeleteRatingBar(BarRatingScam barRatingScam);
    BeerRatingScam DeleteRatingBeer(BeerRatingScam beerRatingScam);
}
