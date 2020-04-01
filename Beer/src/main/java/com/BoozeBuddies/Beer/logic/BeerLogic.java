package com.BoozeBuddies.Beer.logic;


import com.BoozeBuddies.Beer.factory.BeerFactory;
import com.BoozeBuddies.Beer.interfaces.IBeerRepo;
import com.BoozeBuddies.Beer.model.entities.Beer;

public class BeerLogic {
    private BeerFactory beerFactory = new BeerFactory();
    private IBeerRepo userRepo;

    public BeerLogic(IBeerRepo repo)
    {
        userRepo = ((repo == null) ? beerFactory.createBeerRepo() : repo);
    }

    public Beer UpdateBeer(Beer beer) {
        return userRepo.UpdateBeer(beer);
    }

    public Beer GetById(int id) {
        return userRepo.GetById(id);
    }
}
