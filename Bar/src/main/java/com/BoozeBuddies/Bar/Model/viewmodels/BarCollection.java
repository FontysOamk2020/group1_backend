package com.BoozeBuddies.Bar.Model.viewmodels;

import com.BoozeBuddies.Bar.Model.enitities.Bar;

import java.util.List;

public class BarCollection {
    private List<Bar> bars;

    public List<Bar> getBars() {
        return bars;
    }

    public void setBars(List<Bar> bars) {
        this.bars = bars;
    }

    public BarCollection() {
    }
}
