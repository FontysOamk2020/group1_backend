package com.BoozeBuddies.Friend.Logic;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendCollectionRepo;
import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepo;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.factory.FriendFactory;
import org.springframework.lang.Nullable;


public class FriendCollectionLogic {
    private FriendFactory friendFactory = new FriendFactory();
    private IFriendCollectionRepo friendCollectionRepo = friendFactory.createUserCollectionRepo();

    public FriendCollectionLogic(@Nullable IFriendCollectionRepo repo)
    {
        friendCollectionRepo = ((repo == null) ? friendFactory.createUserCollectionRepo() : repo);
    }

    public RelationshipCollection getFriendsById(int id) {
        return friendCollectionRepo.getFriendsById(id);
    }
}
