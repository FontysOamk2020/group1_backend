package com.BoozeBuddies.Beer.factory;

import com.BoozeBuddies.Beer.Dal.Context.BeerContextMySql;
import com.BoozeBuddies.Beer.Dal.Repository.BeerRepo;
import com.BoozeBuddies.Beer.interfaces.IBeerCollectionRepo;
import com.BoozeBuddies.Beer.interfaces.IBeerRepo;


public class BeerFactory {
    public IBeerCollectionRepo createBeerCollectionRepo() { return new BeerRepo(new BeerContextMySql()); }

    public IBeerRepo createBeerRepo() { return new BeerRepo(new BeerContextMySql()); }
}
