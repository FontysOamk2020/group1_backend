package com.BoozeBuddies.Friend.Dal.Interfaces;

import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.Models.RequestRelationship;

public interface IFriendCollectionRepo {
    boolean AddRelationship(Friend requestRelationship);

    boolean DeleteRelationship(Friend relationship);

    RelationshipCollection getFriendsById(int id);
}
