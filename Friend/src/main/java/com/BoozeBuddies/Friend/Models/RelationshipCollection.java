package com.BoozeBuddies.Friend.Models;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.*;

public class RelationshipCollection
{
    private List<Friend> relationships;
    private List<Friend> acceptedFriends;
    private List<Friend> pendingFriends;
    private List<Friend> blockedFriends;


    public List<Friend> getAcceptedFriends() { return acceptedFriends; }

    public void setAcceptedFriends(List<Friend> acceptedFriends) { this.acceptedFriends = acceptedFriends; }

    public List<Friend> getPendingFriends() { return pendingFriends; }

    public void setPendingFriends(List<Friend> pendingFriends) { this.pendingFriends = pendingFriends; }

    public List<Friend> getBlockedFriends() { return blockedFriends; }

    public void setBlockedFriends(List<Friend> blockedFriends) { this.blockedFriends = blockedFriends; }

    public List<Friend> getRelationships()
    {
        return relationships;
    }

    public void setRelationships(List<Friend> relationships)
    {
        this.relationships = relationships;
    }

    public RelationshipCollection()
    {
        relationships = new ArrayList<>();
        acceptedFriends = new ArrayList<>();
        pendingFriends = new ArrayList<>();
        blockedFriends = new ArrayList<>();
    }

    public RelationshipCollection(List<Friend> relationships)
    {
        this.relationships = relationships;
    }


}
