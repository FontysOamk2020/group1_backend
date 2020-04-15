package com.BoozeBuddies.Activity.Interfaces;

import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;

public interface IActivityCollectionRepo {
    boolean AddActivity(ActivityScamEntity activity);
    ActivityCollection GetAllActivities();
}
