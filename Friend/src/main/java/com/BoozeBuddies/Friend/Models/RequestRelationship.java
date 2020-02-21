package com.BoozeBuddies.Friend.Models;

public class RequestRelationship {
    User you;
    String friendUsername;

    public User getYou() {
        return you;
    }

    public void setYou(User you) {
        this.you = you;
    }

    public String getFriendUsername() {
        return friendUsername;
    }

    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }

    public RequestRelationship() {
    }
}
