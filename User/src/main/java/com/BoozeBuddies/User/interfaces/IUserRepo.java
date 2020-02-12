package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.model.User;

public interface IUserRepo {
    boolean updateUsername(User user, String username);
}
