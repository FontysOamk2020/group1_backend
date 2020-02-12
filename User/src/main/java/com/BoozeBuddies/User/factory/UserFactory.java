package com.BoozeBuddies.User.factory;

import com.BoozeBuddies.User.dal.context.UserContextMySql;
import com.BoozeBuddies.User.dal.repository.UserRepo;
import com.BoozeBuddies.User.interfaces.IUserCollectionRepo;
import com.BoozeBuddies.User.interfaces.IUserRepo;

public class UserFactory {
    public IUserCollectionRepo createUserCollectionRepo() { return new UserRepo(new UserContextMySql()); }

    public IUserRepo createUserRepo() { return new UserRepo(new UserContextMySql()); }
}
