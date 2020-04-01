package com.BoozeBuddies.Bar.Repository;

import com.BoozeBuddies.Bar.Interface.IBarContainerContext;
import com.BoozeBuddies.Bar.Model.Bar;

import java.util.List;

public class BarContainerRepository implements IBarContainerContext
{
    private  IBarContainerContext context;

    public BarContainerRepository(IBarContainerContext context) { this.context = context;
    }

    @Override
    public Bar AddBar() {
        return null;
    }

    @Override
    public Bar EditBar() {
        return null;
    }

    @Override
    public Bar DeleteBar() {
        return null;
    }

    @Override
    public List<Bar> GetAllBar() {
        return null;
    }
}
