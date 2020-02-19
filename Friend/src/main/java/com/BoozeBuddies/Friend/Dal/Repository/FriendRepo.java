package com.BoozeBuddies.Friend.Dal.Repository;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import java.util.List;

public class FriendRepo implements IFriendRepositoryContext {

    private IFriendRepositoryContext context;

    public FriendRepo(IFriendRepositoryContext context) { this.context = context; }


}
