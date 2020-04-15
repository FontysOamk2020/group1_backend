package com.BoozeBuddies.Rating.Interface;


import com.BoozeBuddies.Rating.Model.Rating;

public interface IRatingRepo {
    Object AddBarRating(Rating rating);
    Object AddBeerRating(Rating rating);
}
