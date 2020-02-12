package com.BoozeBuddies.User.logic;

import com.BoozeBuddies.User.factory.UserFactory;
import com.BoozeBuddies.User.interfaces.IUserCollectionRepo;
import com.BoozeBuddies.User.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserCollectionLogic {
    private UserFactory userFactory = new UserFactory();
    private IUserCollectionRepo userCollectionRepo = userFactory.createUserCollectionRepo();

    public UserCollectionLogic(IUserCollectionRepo repo)
    {
        userCollectionRepo = ((repo == null) ? userFactory.createUserCollectionRepo() : repo);
    }

    public User addUser(User user) { return userCollectionRepo.addUser(user); }

    public List<User> getAllUsers() { return userCollectionRepo.getAllUsers(); }

    public User getUserById(int id) { return userCollectionRepo.getUserById(id); }

    public User getUserByEmail(String email) { return userCollectionRepo.getUserByEmail(email); }
}
