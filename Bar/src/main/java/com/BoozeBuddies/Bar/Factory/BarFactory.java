package com.BoozeBuddies.Bar.Factory;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Dal.Repository.*;
import com.BoozeBuddies.Bar.Dal.Context.*;

public class BarFactory {

    public IBarContext createBarRepoHibernate() { return new BarRepository(new BarContextMySql()); }

    public IBarContext createUserRepo() { return new BarRepository(new BarContextMySql()); }
}
