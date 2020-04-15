package com.BoozeBuddies.Activity.Logic;

import com.BoozeBuddies.Activity.Factory.ActivityFactory;
import com.BoozeBuddies.Activity.Interfaces.IActivityCollectionRepo;
import com.BoozeBuddies.Activity.Model.Models.Entities.Activity;
import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Entities.Friend;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.RelationshipCollection;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestTemplate;

public class ActivityCollectionLogic {
    private ActivityFactory activityFactory = new ActivityFactory();
    private IActivityCollectionRepo activityCollectionRepo = activityFactory.createActivityRepoHibernate();

    private RestTemplate restTemplate = new RestTemplate();

    public ActivityCollectionLogic(@Nullable IActivityCollectionRepo repo){
        activityCollectionRepo = ((repo == null) ? activityFactory.createActivityRepoHibernate() : repo);
    }

    public boolean AddActivity(ActivityScamEntity activity){
        return activityCollectionRepo.AddActivity(activity);
    }

    public ActivityCollection GetAllActivities(){
        return activityCollectionRepo.GetAllActivities();
    }

    public ActivityCollection GetActivitiesFromMyFriends(int userId){
        //Step 1 > Gets all activities of every user
        ActivityCollection activityCollection = activityCollectionRepo.GetAllActivities();

        //Step 2 > Gets all friends of user
        RelationshipCollection relationshipCollection = restTemplate.getForObject("http://217.101.44.31:8082/api/public/friend/getFriendsByUserId/" + userId, RelationshipCollection.class);

        //Step 3 > Filters to see only activities of my friends
        ActivityCollection activityCollectionToReturn = new ActivityCollection();

        for(Activity activity : activityCollection.getActivities()){
            for(Friend i : relationshipCollection.getRelationships()){
                //Checks if the user is a friend
                if(userId == i.getUserOneId().getId() || userId == i.getUserTwoId().getId()) {
                    //The user is indeed a friend so we want to return this activity.
                    if(activity.getUser().getId() == userId){
                        boolean yetInList = false;
                        for(Activity activityInList : activityCollectionToReturn.getActivities()){
                            if(activityInList.getId() == activity.getId()){
                                yetInList = true;
                            }
                        }
                        if(!yetInList){
                            activityCollectionToReturn.addActivity(activity);
                        }
                    }
                }
            }
        }

        return activityCollectionToReturn;
    }
}
