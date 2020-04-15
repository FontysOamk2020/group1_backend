package com.BoozeBuddies.Rating.Logic;


import com.BoozeBuddies.Rating.Factory.RatingFactory;
import com.BoozeBuddies.Rating.Interface.IRatingCollectionRepo;
import com.BoozeBuddies.Rating.Model.entities.BarRating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRating;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import com.BoozeBuddies.Rating.Model.viewmodels.AverageRatingViewmodel;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.UserRatings;
import org.springframework.lang.Nullable;

public class RatingCollectionLogic {
    private RatingFactory ratingFactory = new RatingFactory();
    private IRatingCollectionRepo ratingCollectionRepo = ratingFactory.createBarRepoHibernate();

    public RatingCollectionLogic(@Nullable IRatingCollectionRepo repo)
    {
        ratingCollectionRepo = ((repo == null) ? ratingFactory.createBarRepoHibernate() : repo);
    }

    public AverageRatingViewmodel GetBarRatingAverage(int barId) {
        BarRatingsCollection barRatingsCollection = ratingCollectionRepo.GetBarRatingAverage(barId);
        double average = 0;
        for (BarRatingScam rating : barRatingsCollection.getBarRatings())
        {
            if(rating.getBarId() == barId)
            {
                average = average + rating.getRating();
            }
        }
        average = average / barRatingsCollection.getBarRatings().size();

        AverageRatingViewmodel averageRatingViewmodel = new AverageRatingViewmodel(average, barId, "Bar", barRatingsCollection.getBarRatings().size());
        return averageRatingViewmodel;
    }

    public AverageRatingViewmodel GetBeerRatingAverage(int beerId) {
        BeerRatingCollection beerRatingCollection = ratingCollectionRepo.GetBeerRatingAverage(beerId);
        double average = 0;
        for (BeerRatingScam rating : beerRatingCollection.getBeerRatings())
        {
            if(rating.getBeerId() == beerId)
            {
                average = average + rating.getRating();
            }
        }
        average = average / beerRatingCollection.getBeerRatings().size();

        AverageRatingViewmodel averageRatingViewmodel = new AverageRatingViewmodel(average, beerId, "Beer", beerRatingCollection.getBeerRatings().size());
        return  averageRatingViewmodel;
    }

    public UserRatings GetAllUserRatings(int userId) {

        return ratingCollectionRepo.GetAllUserRatings(userId);
    }
}
