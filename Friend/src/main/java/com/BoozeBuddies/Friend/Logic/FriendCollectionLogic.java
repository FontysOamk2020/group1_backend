package com.BoozeBuddies.Friend.Logic;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendCollectionRepo;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepo;
import com.BoozeBuddies.Friend.Models.Enums.FriendStatus;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.Models.RequestRelationship;
import com.BoozeBuddies.Friend.Models.User;
import com.BoozeBuddies.Friend.Utils.ApiRequest;
import com.BoozeBuddies.Friend.factory.FriendFactory;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;


public class FriendCollectionLogic {
    private FriendFactory friendFactory = new FriendFactory();
    private IFriendCollectionRepo friendCollectionRepo;

    public FriendCollectionLogic(@Nullable IFriendCollectionRepo repo) {
        friendCollectionRepo = ((repo == null) ? friendFactory.createUserCollectionRepo() : repo);
    }

    public RelationshipCollection getFriendsById(int id) {
        //TODO check for unique relations
        return friendCollectionRepo.getFriendsById(id);
    }

    public boolean AddRelationship(RequestRelationship requestRelationship) {
        //TODO add check if user is already a friend
        Friend friend = new Friend();
        friend.setUserOneId(requestRelationship.getYou());

        String url = "http://217.101.44.31:8081/api/public/user/getUserByUserId/"+requestRelationship.getFriendID();
        User friendUser = (User)ApiRequest.CreateGetRequest(url, new User());

        friend.setStatus(FriendStatus.pending);
        friend.setUserTwoId(friendUser);

        return friendCollectionRepo.AddRelationship(friend);
    }

    public boolean DeleteRelationship(Friend relationship) {
        return friendCollectionRepo.DeleteRelationship(relationship);
    }
}

