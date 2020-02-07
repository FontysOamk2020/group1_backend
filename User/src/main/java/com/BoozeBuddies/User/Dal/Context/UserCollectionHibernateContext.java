package com.BoozeBuddies.User.Dal.Context;

import com.BoozeBuddies.User.Dal.Interfaces.IUserCollectionRepo;
import com.BoozeBuddies.User.Dal.Interfaces.IUserRepo;
import com.BoozeBuddies.User.Dal.Interfaces.IUserRepositoryContext;
import com.BoozeBuddies.User.Models.User;

public class UserCollectionHibernateContext implements IUserRepositoryContext {
    @Override
    public User AddUser(User user) {
        return null;
    }

    @Override
    public Void DeleteUser(User user) {
        return null;
    }

    @Override
    public User GetUserByUserEmail(String email) {
        return null;
    }

    @Override
    public User GetUserByUserId(int id) {
        return null;
    }

    @Override
    public User UpdateUsername(User user) {
        return null;
    }
}
