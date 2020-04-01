package com.BoozeBuddies.Beer.interfaces;


import com.BoozeBuddies.Beer.model.entities.Beer;

public interface IBeerRepo {
    Beer UpdateBeer(Beer beer);
    Beer GetById(int id);
}
