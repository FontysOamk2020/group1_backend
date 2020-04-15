package com.BoozeBuddies.Rating.Resource;


import com.BoozeBuddies.Rating.Dal.Context.RatingContextHibernate;
import com.BoozeBuddies.Rating.Dal.Repository.RatingRepository;
import com.BoozeBuddies.Rating.Logic.RatingCollectionLogic;
import com.BoozeBuddies.Rating.Logic.RatingLogic;
import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.Bar;
import com.BoozeBuddies.Rating.Model.entities.Beer;
import com.BoozeBuddies.Rating.Model.viewmodels.AverageRatingViewmodel;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/public/bar")
public class RatingResource {
    RatingCollectionLogic ratingCollectionLogic = new RatingCollectionLogic(new RatingRepository(new RatingContextHibernate()));
    RatingLogic ratingLogic = new RatingLogic((new RatingRepository(new RatingContextHibernate())));

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getBarAverage/{BarId}")
    public AverageRatingViewmodel GetBarRatingAverage(@PathVariable("BarId") int id) {
        return ratingCollectionLogic.GetBarRatingAverage(id);
    }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getBeerAverage/{BeerId}")
    public AverageRatingViewmodel GetBeerRatingAverage(@PathVariable("BeerId") int id) {
        return ratingCollectionLogic.GetBeerRatingAverage(id);
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/rateBar")
    public Object RateBar(@RequestBody Rating rating) {
        return ratingLogic.AddBarRating(rating);
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/rateBeer")
    public Object RateBeer(@RequestBody Rating rating) {
        return ratingLogic.AddBeerRating(rating);
    }
}
