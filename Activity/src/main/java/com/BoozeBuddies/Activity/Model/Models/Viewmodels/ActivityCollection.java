package com.BoozeBuddies.Activity.Model.Models.Viewmodels;

import com.BoozeBuddies.Activity.Model.Models.Entities.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollection {
    private List<Activity> activities;

    public ActivityCollection(){
        activities = new ArrayList<>();
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void setActivities(List<Activity> activities){
        this.activities = activities;
    }
}
