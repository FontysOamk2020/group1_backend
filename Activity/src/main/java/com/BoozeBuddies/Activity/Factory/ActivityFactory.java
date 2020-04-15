package com.BoozeBuddies.Activity.Factory;

import com.BoozeBuddies.Activity.Dal.Context.ActivityContextHibernate;
import com.BoozeBuddies.Activity.Dal.Repository.ActivityRepository;
import com.BoozeBuddies.Activity.Interfaces.IActivityContext;

public class ActivityFactory {

    public IActivityContext createActivityRepoHibernate(){
        return new ActivityRepository(new ActivityContextHibernate());
    }
}
