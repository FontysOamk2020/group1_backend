package com.BoozeBuddies.Rating.Logic;


import com.BoozeBuddies.Rating.Factory.RatingFactory;
import com.BoozeBuddies.Rating.Interface.IRatingCollectionRepo;
import com.BoozeBuddies.Rating.Model.entities.BarRating;
import com.BoozeBuddies.Rating.Model.entities.BeerRating;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;
import org.springframework.lang.Nullable;

public class RatingCollectionLogic {
    private RatingFactory ratingFactory = new RatingFactory();
    private IRatingCollectionRepo ratingCollectionRepo = ratingFactory.createBarRepoHibernate();

    public RatingCollectionLogic(@Nullable IRatingCollectionRepo repo)
    {
        ratingCollectionRepo = ((repo == null) ? ratingFactory.createBarRepoHibernate() : repo);
    }

    public double GetBarRatingAverage(int barId) {
        BarRatingsCollection barRatingsCollection = ratingCollectionRepo.GetBarRatingAverage(barId);
        double average = 0;
        for (BarRating rating : barRatingsCollection.getBarRatings())
        {
            average = average + rating.getRating();
        }
        average = average / barRatingsCollection.getBarRatings().size();
        return average;
    }

    public double GetBeerRatingAverage(int beerId) {
        BeerRatingCollection beerRatingCollection = ratingCollectionRepo.GetBeerRatingAverage(beerId);
        double average = 0;
        for (BeerRating rating : beerRatingCollection.getBeerRatings())
        {
            average = average + rating.getRating();
        }
        average = average / beerRatingCollection.getBeerRatings().size();
        return  average;
    }
}
