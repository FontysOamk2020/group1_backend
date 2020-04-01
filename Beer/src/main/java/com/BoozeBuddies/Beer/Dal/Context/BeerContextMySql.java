package com.BoozeBuddies.Beer.Dal.Context;

import com.BoozeBuddies.Beer.interfaces.IBeerContext;
import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;

public class BeerContextMySql implements IBeerContext {
    private String sqlUrl;
    private String usernameUrl;
    private String passwordUrl;


    @Override
    public Beer AddBeer(Beer beer) {
        return null;
    }

    @Override
    public Beer DeleteBeer(Beer beer) {
        return null;
    }

    @Override
    public BeerCollection GetAllBeers() {
        return null;
    }

    @Override
    public Beer UpdateBeer(Beer beer) {
        return null;
    }

    @Override
    public Beer GetById(int id) {
        return null;
    }
}
