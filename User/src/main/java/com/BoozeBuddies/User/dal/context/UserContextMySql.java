package com.BoozeBuddies.User.dal.context;

import com.BoozeBuddies.User.interfaces.IUserContext;
import com.BoozeBuddies.User.models.User;

import java.util.List;

public class UserContextMySql implements IUserContext {
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public void updateUsername(User user, String password) {

    }
}
