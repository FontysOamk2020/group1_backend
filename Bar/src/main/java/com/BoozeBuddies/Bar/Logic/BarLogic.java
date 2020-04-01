package com.BoozeBuddies.Bar.Logic;

import com.BoozeBuddies.Bar.Factory.BarFactory;
import com.BoozeBuddies.Bar.Interface.IBarCollectionRepo;
import com.BoozeBuddies.Bar.Interface.IBarRepo;
import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;
import org.springframework.lang.Nullable;

public class BarLogic {
    private BarFactory barFactory = new BarFactory();
    private IBarRepo barCollectionRepo = barFactory.createBarRepoHibernate();

    public BarLogic(@Nullable IBarRepo repo)
    {
        barCollectionRepo = ((repo == null) ? barFactory.createBarRepoHibernate() : repo);
    }

    public Bar AddBeerToBar(Beer beer, Bar bar)
    {
        return barCollectionRepo.AddBeerToBar(beer, bar);
    }

    public Bar RateBar()
    {
        return barCollectionRepo.RateBar();
    }
}
