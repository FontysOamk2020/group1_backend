package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.Beer;

public interface IBarRepo {
    Bar AddBeerToBar(Bar bar);
    Bar RateBar();
}
