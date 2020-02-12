package com.BoozeBuddies.User.resource;

import com.BoozeBuddies.User.dal.context.UserContextMySql;
import com.BoozeBuddies.User.dal.repository.UserRepo;
import com.BoozeBuddies.User.logic.UserCollectionLogic;
import com.BoozeBuddies.User.logic.UserLogic;
import com.BoozeBuddies.User.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "api/public/user")
public class UserResource {

    UserCollectionLogic userCollectionLogic = new UserCollectionLogic(new UserRepo(new UserContextMySql()));
    UserLogic userLogic = new UserLogic(new UserRepo(new UserContextMySql()));

    @GetMapping(value = "/getUserByUserId/{id}")
    User GetUserById(@PathVariable("id")int id)
    {
        return userCollectionLogic.getUserById(id);
    }

    @GetMapping(value = "/getUserByEmail/{email}")
    User GetUserByEmail(@PathVariable("email")String email)
    {
        return userCollectionLogic.getUserByEmail(email);
    }

    @PutMapping(value = "/updateUsername")
    User UpdateUsername(User user)
    {
        return userLogic.updateUsername(user);
    }

    @PostMapping(value = "/addUser")
    User AddUser(User user)
    {
        return userCollectionLogic.addUser(user);
    }

    @DeleteMapping(value = "/deleteUser")
    boolean DeleteUser(User user)
    {
         return userCollectionLogic.deleteUser(user);
    }
}
