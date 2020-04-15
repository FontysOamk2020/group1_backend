package com.BoozeBuddies.Bar.Dal.Context;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.viewmodels.BarBeerModel;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;

public class BarContextMySql implements IBarContext {

    @Override
    public Bar AddBar(Bar bar) {
        return null;
    }

    @Override
    public Bar EditBar(Bar bar) {
        return null;
    }

    @Override
    public Bar DeleteBar(Bar bar) {
        return null;
    }

    @Override
    public BarCollection GetAllBars() {
        return null;
    }

    @Override
    public BarBeerModel AddBeerToBar(com.BoozeBuddies.Bar.Model.entities.BarBeer barBeer) {
        return null;
    }

    @Override
    public Bar RateBar(Bar bar) {
        return null;
    }

    @Override
    public Bar GetById(int id) {
        return null;
    }
}
