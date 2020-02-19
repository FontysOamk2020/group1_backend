package com.BoozeBuddies.Friend.factory;

import com.BoozeBuddies.Friend.Dal.Context.FriendCollectionHibernateContext;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendCollectionRepo;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepo;
import com.BoozeBuddies.Friend.Dal.Repository.FriendRepo;

public class FriendFactory {
    public IFriendCollectionRepo createUserCollectionRepo() { return new FriendRepo(new FriendCollectionHibernateContext()); }

    public IFriendRepo createUserRepo() { return new FriendRepo(new FriendCollectionHibernateContext()); }
}
