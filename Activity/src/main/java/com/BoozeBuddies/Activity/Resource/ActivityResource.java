package com.BoozeBuddies.Activity.Resource;

import com.BoozeBuddies.Activity.Dal.Context.ActivityContextHibernate;
import com.BoozeBuddies.Activity.Dal.Repository.ActivityRepository;
import com.BoozeBuddies.Activity.Logic.ActivityCollectionLogic;
import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequestMapping(value = "api/public/activity")
public class ActivityResource {

    ActivityCollectionLogic activityCollectionLogic = new ActivityCollectionLogic(new ActivityRepository(new ActivityContextHibernate()));

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/postActivity")
    public boolean AddActivity(@RequestBody ActivityScamEntity activity){
        return activityCollectionLogic.AddActivity(activity);
    }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getAllActivities")
    public ActivityCollection GetAllActivities(){
        return activityCollectionLogic.GetAllActivities();
    }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getActivitiesOfMyFriends/{id}")
    public ActivityCollection getActivitiesOfMyFriends(@PathVariable("id") int id){
        return activityCollectionLogic.GetActivitiesFromMyFriends(id);
    }
}
