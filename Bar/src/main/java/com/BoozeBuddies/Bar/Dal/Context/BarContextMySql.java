package com.BoozeBuddies.Bar.Dal.Context;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;

import java.util.List;

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
    public List<Bar> GetAllBar() {
        return null;
    }

    @Override
    public Bar AddBeerToBar(Beer beer, Bar bar) {
        return null;
    }

    @Override
    public Bar RateBar() {
        return null;
    }
}
