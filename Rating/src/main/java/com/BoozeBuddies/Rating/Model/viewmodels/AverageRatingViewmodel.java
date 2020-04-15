package com.BoozeBuddies.Rating.Model.viewmodels;

public class AverageRatingViewmodel {
    double average;
    int RatedObject;
    String Object;

    public AverageRatingViewmodel() {
    }

    public AverageRatingViewmodel(double average, int ratedObject, String object) {
        this.average = average;
        RatedObject = ratedObject;
        Object = object;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getRatedObject() {
        return RatedObject;
    }

    public void setRatedObject(int ratedObject) {
        RatedObject = ratedObject;
    }

    public String getObject() {
        return Object;
    }

    public void setObject(String object) {
        Object = object;
    }
}
