package com.BoozeBuddies.Bar.Logic;

import com.BoozeBuddies.Bar.Factory.BarFactory;
import com.BoozeBuddies.Bar.Interface.IBarCollectionRepo;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;
import org.springframework.lang.Nullable;

public class BarCollectionLogic {
    private BarFactory barFactory = new BarFactory();
    private IBarCollectionRepo barCollectionRepo = barFactory.createBarRepoHibernate();

    public BarCollectionLogic(@Nullable IBarCollectionRepo repo)
    {
        barCollectionRepo = ((repo == null) ? barFactory.createBarRepoHibernate() : repo);
    }

    public Bar AddBar(Bar bar)
    {
      return barCollectionRepo.AddBar(bar);
    }

    public Bar EditBar(Bar bar)
    {
        return barCollectionRepo.EditBar(bar);
    }

    public Bar DeleteBar(Bar bar)
    {
        return barCollectionRepo.DeleteBar(bar);
    }

    public BarCollection GetAllBars()
    {
        return barCollectionRepo.GetAllBars();
    }
}
