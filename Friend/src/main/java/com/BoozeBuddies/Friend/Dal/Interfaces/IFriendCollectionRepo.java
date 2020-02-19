package com.BoozeBuddies.Friend.Dal.Interfaces;

import com.BoozeBuddies.Friend.Models.Relationship;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.Models.User;

public interface IFriendCollectionRepo {
    boolean AddRelationship(Relationship relationship);

    boolean DeleteRelationship(Relationship relationship);

    RelationshipCollection getFriendsById(int id);
}
