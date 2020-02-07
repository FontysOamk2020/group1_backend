package com.BoozeBuddies.User.Dal.Interfaces;

import com.BoozeBuddies.User.Models.User;

public interface IUserRepo {
    User UpdateUsername(User user);
}
