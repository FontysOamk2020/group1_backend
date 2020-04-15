package com.BoozeBuddies.Rating.Resource;


import com.BoozeBuddies.Rating.Dal.Context.RatingContextHibernate;
import com.BoozeBuddies.Rating.Dal.Repository.RatingRepository;
import com.BoozeBuddies.Rating.Logic.RatingCollectionLogic;
import com.BoozeBuddies.Rating.Logic.RatingLogic;
import com.BoozeBuddies.Rating.Model.entities.Bar;
import com.BoozeBuddies.Rating.Model.entities.Beer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/public/bar")
public class BarResource {
    RatingCollectionLogic ratingCollectionLogic = new RatingCollectionLogic(new RatingRepository(new RatingContextHibernate()));
    RatingLogic ratingLogic = new RatingLogic((new RatingRepository(new RatingContextHibernate())));

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/getBarAverage")
    public double AddBar(@RequestBody Bar bar) {
        return ratingCollectionLogic.GetBarRatingAverage(bar.getId());
    }

    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "//getBeerAverage")
    public double EditBar(@RequestBody Beer beer) {
        return ratingCollectionLogic.GetBeerRatingAverage(beer.getId());
    }

    @CrossOrigin(origins = {"*"})
    @DeleteMapping(value = "/rate")
    public Object DeleteBar(JSONPObject jsonpObject) {
        return ratingLogic.AddRating(jsonpObject);
    }



}
