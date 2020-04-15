package com.BoozeBuddies.Bar.Model.viewmodels;

public class BarBeerModel {

    public BarBeerModel(){

    }

    public int barId;
    public int beerId;
    public double price;

    public int getBarId() {
        return barId;
    }

    public void setBarId(int barId) {
        this.barId = barId;
    }

    public int getBeerId() {
        return beerId;
    }

    public void setBeerId(int beerId) {
        this.beerId = beerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
