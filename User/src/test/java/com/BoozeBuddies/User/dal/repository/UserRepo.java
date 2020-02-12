package com.BoozeBuddies.User.dal.repository;

import com.BoozeBuddies.User.interfaces.IUserContext;
import com.BoozeBuddies.User.model.User;

import java.util.List;

public class UserRepo implements IUserContext {

    private IUserContext context;

    public UserRepo(IUserContext context) { this.context = context; }

    @Override
    public User addUser(User user) {
        return context.addUser(user);
    }

    @Override
    public User updateUsername(User user, String username) {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        context.deleteUser(user);
        return true;
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
}
