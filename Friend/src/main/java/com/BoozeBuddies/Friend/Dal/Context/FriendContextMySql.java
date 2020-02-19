package com.BoozeBuddies.Friend.Dal.Context;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Relationship;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;


public class FriendContextMySql implements IFriendRepositoryContext {

    @Override
    public boolean AddRelationship(Relationship relationship) {
        return false;
    }

    @Override
    public boolean DeleteRelationship(Relationship relationship) {
        return false;
    }

    @Override
    public RelationshipCollection getFriendsById(int id) {
        return null;
    }

    @Override
    public boolean UpdateRelationship(Relationship relationship) {
        return false;
    }
}
