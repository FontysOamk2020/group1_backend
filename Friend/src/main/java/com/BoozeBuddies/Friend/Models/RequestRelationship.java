package com.BoozeBuddies.Friend.Models;

public class RequestRelationship {
    User you;
    int friendID;

    public User getYou() {
        return you;
    }

    public void setYou(User you) {
        this.you = you;
    }

    public int getFriendID() {
        return friendID;
    }

    public void setFriendID(int friendID) {
        this.friendID = friendID;
    }

    public RequestRelationship() {
    }
}
