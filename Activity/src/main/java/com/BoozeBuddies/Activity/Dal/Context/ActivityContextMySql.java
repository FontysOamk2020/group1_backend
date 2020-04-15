package com.BoozeBuddies.Activity.Dal.Context;

import com.BoozeBuddies.Activity.Interfaces.IActivityContext;
import com.BoozeBuddies.Activity.Model.Models.Entities.Activity;
import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;

public class ActivityContextMySql implements IActivityContext {

    @Override
    public boolean AddActivity(ActivityScamEntity activity) {
        return false;
    }

    @Override
    public ActivityCollection GetAllActivities() {
        return null;
    }
}
