package com.BoozeBuddies.Beer.model.viewmodels;

import com.BoozeBuddies.Beer.model.entities.Beer;

import java.util.List;

public class BeerCollection {
    private List<Beer> beers;

    public List<Beer> getBeers() {
        return beers;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    public BeerCollection() {
    }
}
