package com.BoozeBuddies.Friend.Dal.Repository;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Relationship;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;

import java.util.List;

public class FriendRepo implements IFriendRepositoryContext {

    private IFriendRepositoryContext context;

    public FriendRepo(IFriendRepositoryContext context) { this.context = context; }


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
