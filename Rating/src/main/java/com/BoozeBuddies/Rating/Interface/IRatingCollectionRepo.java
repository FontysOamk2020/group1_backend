package com.BoozeBuddies.Rating.Interface;


import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.UserRatings;

public interface IRatingCollectionRepo {
   BarRatingsCollection GetBarRatingAverage(int BarId);
   BeerRatingCollection GetBeerRatingAverage(int BeerId);
   UserRatings GetAllUserRatings(int userId);
}
