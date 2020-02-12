package com.BoozeBuddies.User.resource;

import com.BoozeBuddies.User.dal.repository.UserRepo;
import com.BoozeBuddies.User.model.User;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "api/public/user")
public class UserResource {

    @GetMapping(value = "/getUserByUserId/{id}")
    User GetUserByUserId(@PathVariable("id")int id)
    {
        return UserRepo.GetUserById(id);
    }

    @GetMapping(value = "/getUserByEmail/{email}")
    User GetUserByEmail(@PathVariable("email")String email)
    {
        return UserRepo.GetUserByEmail(email);
    }

    @PutMapping(value = "/UpdateUsername")
    User UpdateUsername(User user)
    {
        return UserRepo.UpdateUsername(user);
    }

    @PostMapping(value = "/addUser")
    User AddUser(User user)
    {
        return UserRepo.AddUser(user);
    }

    @DeleteMapping(value = "/deleteUser")
    User DeleteUser(User user)
    {
        return UserRepo.DeleteUser(user);
    }
}
