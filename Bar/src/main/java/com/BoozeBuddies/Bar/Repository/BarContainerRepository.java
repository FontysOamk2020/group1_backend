package com.BoozeBuddies.Bar.Repository;

import com.BoozeBuddies.Bar.Interface.IBarContainerContext;
import com.BoozeBuddies.Bar.Model.enitities.Bar;

import java.util.List;

public class BarContainerRepository implements IBarContainerContext
{
    private  IBarContainerContext context;

    public BarContainerRepository(IBarContainerContext context) { this.context = context;
    }

    @Override
    public Bar AddBar(Bar bar) {
        return context.AddBar();
    }

    @Override
    public Bar EditBar(Bar bar) {
        return context.EditBar();
    }

    @Override
    public Bar DeleteBar(Bar bar) {
        return context.DeleteBar();
    }

    @Override
    public List<Bar> GetAllBar() {
        return context.GetAllBar();
    }
}
