package com.BoozeBuddies.Bar.Repository;

import com.BoozeBuddies.Bar.Interface.IBarContainerContext;
import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.Bar;

public class BarRepository implements IBarContext {
    private IBarContext context;

    public BarRepository(IBarContext context) {
        this.context = context;
    }

    public Bar AddBeerToBar() {
        return null;
    }

    public Bar RateBar() {
        return null;
    }
}
