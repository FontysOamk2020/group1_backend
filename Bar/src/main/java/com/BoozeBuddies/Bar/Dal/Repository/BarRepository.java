package com.BoozeBuddies.Bar.Dal.Repository;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.Beer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;

public class BarRepository implements IBarContext {
    private IBarContext context;

    public BarRepository(IBarContext context) {
        this.context = context;
    }

    @Override
    public Bar AddBar(Bar bar) {
        return context.AddBar(bar);
    }

    @Override
    public Bar EditBar(Bar bar) {
        return context.EditBar(bar);
    }

    @Override
    public Bar DeleteBar(Bar bar) {
        return context.DeleteBar(bar);
    }

    @Override
    public BarCollection GetAllBars() {
        return context.GetAllBars();
    }

    @Override
    public Bar AddBeerToBar(Bar bar) {
        return context.AddBar(bar);
    }

    @Override
    public Bar RateBar() {
        return context.RateBar();
    }
}
