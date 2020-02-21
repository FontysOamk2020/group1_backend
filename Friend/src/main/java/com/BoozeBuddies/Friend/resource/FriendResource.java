package com.BoozeBuddies.Friend.resource;

import com.BoozeBuddies.Friend.Dal.Context.FriendCollectionHibernateContext;
import com.BoozeBuddies.Friend.Logic.FriendCollectionLogic;
import com.BoozeBuddies.Friend.Logic.FriendLogic;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.Models.RequestRelationship;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/public/friend")
public class FriendResource {

    FriendCollectionLogic friendCollectionLogic = new FriendCollectionLogic(new FriendCollectionHibernateContext());
    FriendLogic friendLogic = new FriendLogic(new FriendCollectionHibernateContext());

    @GetMapping(path = "/getFriendsByUserId/{id}")
    RelationshipCollection GetAllFriendsById(@PathVariable("id") int id){
        return friendCollectionLogic.getFriendsById(id);
    }

    @PutMapping(path = "/updateRelationshipStatus")
    Boolean UpdateRelationshipStatus(@RequestBody Friend updateRelationshipStatus){
        return friendLogic.changeRelationStatus(updateRelationshipStatus);
    }

    @PostMapping(path = "/addRelationship")
    Boolean AddRelationship(@RequestBody RequestRelationship requestRelationship){
        return friendCollectionLogic.AddRelationship(requestRelationship);
    }

    @DeleteMapping(path = "/deleteRelationship")
    Boolean DeleteRelationship(@RequestBody Friend updateRelationshipStatus){
        return friendCollectionLogic.DeleteRelationship(updateRelationshipStatus);
    }

}
