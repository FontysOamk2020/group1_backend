package com.BoozeBuddies.User.logic;

import com.BoozeBuddies.User.factory.UserFactory;
import com.BoozeBuddies.User.interfaces.IUserRepo;
import com.BoozeBuddies.User.model.User;


public class UserLogic {
    private UserFactory userFactory = new UserFactory();
    private IUserRepo userRepo;

    public UserLogic(IUserRepo repo)
    {
        userRepo = ((repo == null) ? userFactory.createUserRepo() : repo);
    }

    public void logout(User user) {}
}
