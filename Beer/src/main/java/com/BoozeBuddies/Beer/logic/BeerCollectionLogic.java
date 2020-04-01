package com.BoozeBuddies.Beer.logic;

import com.BoozeBuddies.Beer.factory.BeerFactory;
import com.BoozeBuddies.Beer.interfaces.IBeerCollectionRepo;
import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;
import org.springframework.lang.Nullable;

public class BeerCollectionLogic {
    private BeerFactory beerFactory = new BeerFactory();
    private IBeerCollectionRepo beerCollectionRepo = beerFactory.createBeerCollectionRepo();

    public BeerCollectionLogic(@Nullable IBeerCollectionRepo repo)
    {
        beerCollectionRepo = ((repo == null) ? beerFactory.createBeerCollectionRepo() : repo);
    }

    public Beer AddBeer(Beer beer) {
        return beerCollectionRepo.AddBeer(beer);
    }

    public Beer DeleteBeer(Beer beer) {
        return beerCollectionRepo.DeleteBeer(beer);
    }

    public BeerCollection GetAllBeers() {
        return beerCollectionRepo.GetAllBeers();
    }
}
