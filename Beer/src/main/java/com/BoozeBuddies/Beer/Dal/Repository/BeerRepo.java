package com.BoozeBuddies.Beer.Dal.Repository;

import com.BoozeBuddies.Beer.Dal.Context.BeerContextMySql;
import com.BoozeBuddies.Beer.interfaces.IBeerContext;
import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;

import java.util.List;

public class BeerRepo implements IBeerContext {

    private IBeerContext context;

    public BeerRepo(IBeerContext context) { this.context = context; }

    @Override
    public Beer AddBeer(Beer beer) {
        return context.AddBeer(beer);
    }

    @Override
    public Beer DeleteBeer(Beer beer) {
        return context.DeleteBeer(beer);
    }

    @Override
    public BeerCollection GetAllBeers() {
        return context.GetAllBeers();
    }

    @Override
    public Beer UpdateBeer(Beer beer) {
        return context.UpdateBeer(beer);
    }

    @Override
    public Beer GetById(int id) {
        return context.GetById(id);
    }
}
