package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.model.User;

import java.util.List;

public interface IUserCollectionRepo {
    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByEmail(String email);
}
