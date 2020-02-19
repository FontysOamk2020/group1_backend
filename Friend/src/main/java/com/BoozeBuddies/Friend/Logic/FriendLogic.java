package com.BoozeBuddies.Friend.Logic;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendCollectionRepo;
import com.BoozeBuddies.Friend.factory.FriendFactory;
import jdk.internal.jline.internal.Nullable;

public class FriendLogic {
    private FriendFactory friendFactory = new FriendFactory();
    private IFriendCollectionRepo friendCollectionRepo = friendFactory.createUserCollectionRepo();

    public FriendLogic(@Nullable IFriendCollectionRepo repo)
    {
        friendCollectionRepo = ((repo == null) ? friendFactory.createUserCollectionRepo() : repo);
    }

}
