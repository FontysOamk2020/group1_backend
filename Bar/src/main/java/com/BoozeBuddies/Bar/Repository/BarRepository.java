package com.BoozeBuddies.Bar.Repository;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;

public class BarRepository implements IBarContext {
    private IBarContext context;

    public BarRepository(IBarContext context) {
        this.context = context;
    }

    public Bar AddBeerToBar(Beer beer, Bar bar) {
        return null;
    }

    public Bar RateBar() {
        return null;
    }
}
