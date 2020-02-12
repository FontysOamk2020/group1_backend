package com.BoozeBuddies.User.resource;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "api/public/user")
public class UserResource {

    @GetMapping(value = "/getUserByUserId/{id}")
    User GetUserByUserId(@PathVariable("id")int id)
    {

    }

    @GetMapping(value = "/getUserByEmail/{email}")
    com.BoozeBuddies.User.model.User GetUserByUserEmail(@PathVariable("email")String email){
        return null;
    }

    @PutMapping(value = "/UpdateUsername")
    User UpdateUsername(User user)
    {
        return UserResource.UpdateUsername(user);
    }

    @PostMapping(value = "/addUser")
    User AddUser(User user)
    {
        return UserResource.AddUser(user);
    }

    @DeleteMapping(value = "/deleteUser")
    com.BoozeBuddies.User.model.User DeleteUser(){
        return null;
    }
}