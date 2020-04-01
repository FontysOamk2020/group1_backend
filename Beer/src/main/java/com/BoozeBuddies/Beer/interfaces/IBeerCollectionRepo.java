package com.BoozeBuddies.Beer.interfaces;

import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;

import java.util.List;

public interface IBeerCollectionRepo{
    Beer AddBeer(Beer beer);
    Beer DeleteBeer(Beer beer);
    BeerCollection GetAllBeers();
}
