package com.BoozeBuddies.Bar.Factory;

import com.BoozeBuddies.Bar.Context.BarContainerContext;
import com.BoozeBuddies.Bar.Context.BarContainerHibernateContext;
import com.BoozeBuddies.Bar.Context.BarHibernateContext;
import com.BoozeBuddies.Bar.Interface.IBarContainerContext;
import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Repository.BarContainerRepository;
import com.BoozeBuddies.Bar.Repository.BarRepository;

public class BarContainerFactory {
    public IBarContainerContext createBarCollectionRepoHibernate() { return new BarContainerRepository(new BarContainerHibernateContext()); }

    public IBarContainerContext createBarCollectionRepo() { return new BarContainerRepository(new BarContainerContext()); }
}
