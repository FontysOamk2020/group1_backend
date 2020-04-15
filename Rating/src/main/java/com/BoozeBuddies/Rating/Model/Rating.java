package com.BoozeBuddies.Rating.Model;

public class Rating {
    private int userId;
    private int objectId;
    private double objectRating;

    public Rating(int userId, int objectId, double objectRating) {
        this.userId = userId;
        this.objectId = objectId;
        this.objectRating = objectRating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public double getObjectRating() {
        return objectRating;
    }

    public void setObjectRating(double objectRating) {
        this.objectRating = objectRating;
    }
}
