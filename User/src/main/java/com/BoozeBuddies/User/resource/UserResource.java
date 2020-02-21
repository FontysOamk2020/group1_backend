package com.BoozeBuddies.User.resource;

import com.BoozeBuddies.User.dal.context.UserContextHibernate;
import com.BoozeBuddies.User.dal.repository.UserRepo;
import com.BoozeBuddies.User.logic.UserCollectionLogic;
import com.BoozeBuddies.User.logic.UserLogic;
import com.BoozeBuddies.User.model.UpdateUser;
import com.BoozeBuddies.User.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "api/public/user")
public class UserResource {

    UserCollectionLogic userCollectionLogic = new UserCollectionLogic(new UserRepo(new UserContextHibernate()));
    UserLogic userLogic = new UserLogic(new UserRepo(new UserContextHibernate()));
    
    @GetMapping(value = "/getUserByUserId/{id}")
    User GetUserById(@PathVariable("id")int id)
    {
        return userCollectionLogic.getUserById(id);
    }

    @GetMapping(value = "/getUserByUsername/{username}")
    User GetUserByUsername(@PathVariable("username")String username)
    {
        return userCollectionLogic.GetUserByUsername(username);
    }

    @GetMapping(value = "/getUserByEmail/{email}")
    User GetUserByEmail(@PathVariable("email")String email)
    {
        return userCollectionLogic.getUserByEmail(email);
    }

    @PutMapping(value = "/UpdateUsername")
    User UpdateUsername(@RequestBody UpdateUser updateUser)
    {
        return userLogic.updateUsername(updateUser);
    }

    @PostMapping(value = "/addUser")
    User AddUser(@RequestBody User user)
    {
        return userCollectionLogic.addUser(user);
    }

    @DeleteMapping(value = "/deleteUser")
    boolean DeleteUser(@RequestBody User user) { return userLogic.deleteUser(user); }

    @GetMapping(value = "/getAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> getAllUsers()
    {
        return userCollectionLogic.getAllUsers();
    }
}
