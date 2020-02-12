package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.model.User;

public interface IUserRepo {
    User updateUsername(User user, String username);

    boolean deleteUser(User user);
}
