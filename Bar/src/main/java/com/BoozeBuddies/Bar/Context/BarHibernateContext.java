package com.BoozeBuddies.Bar.Context;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;

public class BarHibernateContext implements IBarContext {
    @Override
    public Bar AddBeerToBar(Beer beer, Bar bar) {
        return null;
    }

    @Override
    public Bar RateBar() {
        return null;
    }
}
