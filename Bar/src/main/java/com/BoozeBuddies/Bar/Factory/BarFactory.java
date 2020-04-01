package com.BoozeBuddies.Bar.Factory;

import com.BoozeBuddies.Bar.Context.BarContext;
import com.BoozeBuddies.Bar.Context.BarHibernateContext;
import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Repository.BarRepository;

public class BarFactory {

    public IBarContext createBarRepoHibernate() { return new BarRepository(new BarHibernateContext()); }

    public IBarContext createUserRepo() { return new BarRepository(new BarContext()); }
}
