package com.BoozeBuddies.Rating.Model.viewmodels;

public class AverageRatingViewmodel {
    double average;
    int RatedObject;
    String Object;
    int numberOfRatings;

    public AverageRatingViewmodel() {
    }

    public AverageRatingViewmodel(double average, int ratedObject, String object, int numberOfRatings) {
        this.average = average;
        RatedObject = ratedObject;
        Object = object;
        this.numberOfRatings = numberOfRatings;
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

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

}
