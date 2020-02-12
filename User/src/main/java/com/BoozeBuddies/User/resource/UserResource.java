package com.BoozeBuddies.User.resource;
import com.BoozeBuddies.User.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/public/user")
public class UserResource {

    @GetMapping(value = "/getUserByUserId/{id}")
    User GetUserByUserId(@PathVariable("id")int id){
        return null;
    }

    @GetMapping(value = "/getUserByEmail/{email}")
    User GetUserByUserEmail(@PathVariable("email")String email){
        return null;
    }

    @PutMapping(value = "/UpdateUsername")
    User UpdateUsername(){
        return null;
    }

    @PostMapping(value = "/addUser")
    User AddUser(){
        return null;
    }

    @DeleteMapping(value = "/deleteUser")
    User DeleteUser(){
        return null;
    }
}
