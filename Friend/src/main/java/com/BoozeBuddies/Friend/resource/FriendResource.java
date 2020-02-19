package com.BoozeBuddies.Friend.resource;

import com.BoozeBuddies.Friend.Dal.Context.FriendCollectionHibernateContext;
import com.BoozeBuddies.Friend.Logic.FriendCollectionLogic;
import com.BoozeBuddies.Friend.Logic.FriendLogic;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/public/friend")
public class FriendResource {

    FriendCollectionLogic friendCollectionLogic = new FriendCollectionLogic(new FriendCollectionHibernateContext());
    FriendLogic friendLogic = new FriendLogic(new FriendCollectionHibernateContext());

    @RequestMapping(path = "/getFriendsByUserId/{id}")
    RelationshipCollection GetAllFriendsById(@PathVariable("id") int id){
        return friendCollectionLogic.getFriendsById(id);
    }

}
