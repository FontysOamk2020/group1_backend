package com.BoozeBuddies.Friend.Logic;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepo;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.factory.FriendFactory;
import org.springframework.lang.Nullable;


public class FriendLogic {
    private FriendFactory friendFactory = new FriendFactory();
    private IFriendRepo friendRepo;

    public FriendLogic(@Nullable IFriendRepo repo)
    {
        friendRepo = ((repo == null) ? friendFactory.createUserRepo() : repo);
    }

    public boolean changeRelationStatus(Friend updateRelationship){
        return friendRepo.UpdateRelationship(updateRelationship);
    }

}
