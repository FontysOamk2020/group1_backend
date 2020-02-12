package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.models.User;

public interface IUserRepo {
    void updateUsername(User user, String password);
}
