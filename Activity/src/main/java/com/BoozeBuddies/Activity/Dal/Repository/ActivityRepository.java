package com.BoozeBuddies.Activity.Dal.Repository;

import com.BoozeBuddies.Activity.Dal.Context.ActivityContextMySql;
import com.BoozeBuddies.Activity.Interfaces.IActivityContext;
import com.BoozeBuddies.Activity.Model.Models.Entities.Activity;
import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;

public class ActivityRepository implements IActivityContext{
    private IActivityContext context;

    public ActivityRepository(IActivityContext context){
        this.context = context;
    }

    public IActivityContext createActivityRepoHibernate(){
        return new ActivityRepository(new ActivityContextMySql());
    }

    @Override
    public boolean AddActivity(ActivityScamEntity activity) {
        return context.AddActivity(activity);
    }

    @Override
    public ActivityCollection GetAllActivities() {
        return context.GetAllActivities();
    }
}
