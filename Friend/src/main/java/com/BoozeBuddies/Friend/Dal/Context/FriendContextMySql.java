package com.BoozeBuddies.Friend.Dal.Context;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;


public class FriendContextMySql implements IFriendRepositoryContext {

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
