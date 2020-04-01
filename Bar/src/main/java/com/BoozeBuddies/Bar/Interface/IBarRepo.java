package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;

public interface IBarRepo {
    Bar AddBeerToBar(Beer beer, Bar bar);
    Bar RateBar();
}
