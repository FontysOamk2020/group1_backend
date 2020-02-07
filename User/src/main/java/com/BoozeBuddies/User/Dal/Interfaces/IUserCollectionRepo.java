package com.BoozeBuddies.User.Dal.Interfaces;

import com.BoozeBuddies.User.Models.User;

public interface IUserCollectionRepo {
    User AddUser(User user);
    Void DeleteUser(User user);
    User GetUserByUserEmail(String email);
    User GetUserByUserId(int id);
}
