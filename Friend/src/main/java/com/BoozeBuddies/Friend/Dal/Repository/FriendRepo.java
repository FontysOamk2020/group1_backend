package com.BoozeBuddies.Friend.Dal.Repository;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;

public class FriendRepo implements IFriendRepositoryContext {

    private IFriendRepositoryContext context;

    public FriendRepo(IFriendRepositoryContext context) { this.context = context; }


    @Override
    public boolean AddRelationship(Friend relationship) {
        return false;
    }

    @Override
    public boolean DeleteRelationship(Friend relationship) {
        return false;
    }

    @Override
    public RelationshipCollection getFriendsById(int id) {
        return null;
    }

    @Override
    public boolean UpdateRelationship(Friend relationship) {
        return false;
    }
}
