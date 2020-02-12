package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.model.User;

public interface IUserRepo {
    void updateUsername(User user, String password);
}
