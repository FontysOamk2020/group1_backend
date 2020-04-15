package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.BarBeer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarBeerModel;

public interface IBarRepo {
    BarBeerModel AddBeerToBar(BarBeer barBeer);
    Bar RateBar();
    Bar GetById(int id);
}
