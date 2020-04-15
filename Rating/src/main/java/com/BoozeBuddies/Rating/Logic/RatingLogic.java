package com.BoozeBuddies.Rating.Logic;


import com.BoozeBuddies.Rating.Factory.RatingFactory;
import com.BoozeBuddies.Rating.Interface.IRatingRepo;
import org.json.JSONObject;

import org.springframework.lang.Nullable;

public class RatingLogic {
    private RatingFactory ratingFactory = new RatingFactory();
    private IRatingRepo barCollectionRepo = ratingFactory.createBarRepoHibernate();

    public RatingLogic(@Nullable IRatingRepo repo)
    {
        barCollectionRepo = ((repo == null) ? ratingFactory.createBarRepoHibernate() : repo);
    }

    public Object AddRating(JSONObject) {

        Class ReflectionClass = Class.forName("com.BoozeBuddies.Rating.Model.entities" + jsonpObject.)
        return null;
    }
}
