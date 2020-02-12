package com.BoozeBuddies.User.interfaces;

import com.BoozeBuddies.User.model.UpdateUser;
import com.BoozeBuddies.User.model.User;

public interface IUserRepo {
    User updateUsername(UpdateUser updateUser);

    boolean deleteUser(User user);
}
