package com.BoozeBuddies.User.dal.repository;

import com.BoozeBuddies.User.interfaces.IUserContext;
import com.BoozeBuddies.User.model.UpdateUser;
import com.BoozeBuddies.User.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo implements IUserContext {

    private IUserContext context;

    public UserRepo(IUserContext context) { this.context = context; }

    @Override
    public User addUser(User user) {
        return context.addUser(user);
    }

    @Override
    public boolean deleteUser(User user) {
        return context.deleteUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return context.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return context.getUserById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return context.getUserByEmail(email);
    }

    @Override
    public User getUserByUsername(String username) {
       return context.getUserByUsername(username);
    }

    @Override
    public User updateUsername(UpdateUser updateUser) {
        return context.updateUsername(updateUser);
    }
}
