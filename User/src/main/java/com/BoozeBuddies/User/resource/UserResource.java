package com.BoozeBuddies.User.resource;

import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/updateUsername")
    com.BoozeBuddies.User.model.User UpdateUsername(){
        return null;
    }

    @PostMapping(value = "/addUser")
    com.BoozeBuddies.User.model.User AddUser(){
        return null;
    }

    @DeleteMapping(value = "/deleteUser")
    com.BoozeBuddies.User.model.User DeleteUser(){
        return null;
    }
}
