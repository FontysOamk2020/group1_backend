package com.BoozeBuddies.Bar.Logic;

import Utils.ApiRequest;
import com.BoozeBuddies.Bar.Factory.BarFactory;
import com.BoozeBuddies.Bar.Interface.IBarRepo;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.BarBeer;
import com.BoozeBuddies.Bar.Model.entities.Beer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarBeerModel;
import org.springframework.lang.Nullable;

public class BarLogic {
    private BarFactory barFactory = new BarFactory();
    private IBarRepo barCollectionRepo = barFactory.createBarRepoHibernate();

    public BarLogic(@Nullable IBarRepo repo)
    {
        barCollectionRepo = ((repo == null) ? barFactory.createBarRepoHibernate() : repo);
    }

    public BarBeerModel AddBeerToBar(BarBeerModel bar)
    {
        Bar barToAdd = new Bar();
        barToAdd = GetById(bar.barId);

        Beer beerToAdd;
        String url = "http://217.101.44.31:8083/api/public/beer/getById/" + bar.getBeerId();
        beerToAdd = (Beer)ApiRequest.CreateGetRequest(url, new Beer());

        BarBeer barBeer = new BarBeer();
        barBeer.setBar(barToAdd);
        barBeer.setBeer(beerToAdd);

        barBeer.setPrice(bar.getPrice());

        return barCollectionRepo.AddBeerToBar(barBeer);
    }

    public Bar RateBar()
    {
        return barCollectionRepo.RateBar();
    }

    public Bar GetById(int id)
    {
        return barCollectionRepo.GetById(id);
    }

}
