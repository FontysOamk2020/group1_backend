package com.BoozeBuddies.Beer.model;

public class UpdateUser {

    private int id;
    private String newUsername;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public UpdateUser() {
    }
}
