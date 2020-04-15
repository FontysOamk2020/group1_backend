package com.BoozeBuddies.Rating.Resource;


import com.BoozeBuddies.Rating.Dal.Context.RatingContextHibernate;
import com.BoozeBuddies.Rating.Dal.Repository.RatingRepository;
import com.BoozeBuddies.Rating.Logic.RatingCollectionLogic;
import com.BoozeBuddies.Rating.Logic.RatingLogic;
import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.Bar;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.Beer;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import com.BoozeBuddies.Rating.Model.viewmodels.AverageRatingViewmodel;
import com.BoozeBuddies.Rating.Model.viewmodels.UserRatings;
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
    @GetMapping(value = "/getAllUserRatings/{userId}")
    public UserRatings GetAllUserRatings(@PathVariable("userId") int id) {
        return ratingCollectionLogic.GetAllUserRatings(id);
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

    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/EditBeerRating")
    public BeerRatingScam EditBeerRating(@RequestBody BeerRatingScam beerRatingScam) {
        return ratingLogic.EditBeerRating(beerRatingScam);
    }

    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/EditBarRating")
    public BarRatingScam EditBarRating(@RequestBody BarRatingScam barRatingScam) {
        return ratingLogic.EditBarRating(barRatingScam);
    }

    @CrossOrigin(origins = {"*"})
    @DeleteMapping(value = "/DeleteBeerRating")
    public BeerRatingScam DeleteBeerRating(@RequestBody BeerRatingScam beerRatingScam) {
        return ratingLogic.DeleteBeerRating(beerRatingScam);
    }

    @CrossOrigin(origins = {"*"})
    @DeleteMapping(value = "/DeleteBarRating")
    public BarRatingScam DeleteBarRating(@RequestBody BarRatingScam barRatingScam) {
        return ratingLogic.DeleteBarRating(barRatingScam);
    }

}
