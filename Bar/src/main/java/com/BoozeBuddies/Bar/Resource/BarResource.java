package com.BoozeBuddies.Bar.Resource;

import com.BoozeBuddies.Bar.Logic.BarCollectionLogic;
import com.BoozeBuddies.Bar.Logic.BarLogic;
import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.enitities.Beer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BoozeBuddies.Bar.Dal.Repository.*;
import com.BoozeBuddies.Bar.Dal.Context.*;

@RestController
@RequestMapping(value = "api/public/bar")
public class BarResource {
    BarCollectionLogic barCollectionLogic = new BarCollectionLogic(new BarRepository(new BarContextHibernate()));
    BarLogic barLogic = new BarLogic((new BarRepository(new BarContextHibernate())));

    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/addBar")
    public Bar AddBar(Bar bar) {
        return barCollectionLogic.AddBar(bar);
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/editBar")
    public Bar EditBar(Bar bar) {
        return barCollectionLogic.EditBar(bar);
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/deleteBar")
    public Bar DeleteBar(Bar bar) {
        return barCollectionLogic.DeleteBar(bar);
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/getAllBeers")
    public BarCollection GetAllBars() {
        return barCollectionLogic.GetAllBars();
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/addBeerToBar")
    public Bar AddBeerToBar(Beer beer, Bar bar) {
        return barLogic.AddBeerToBar(beer, bar);
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/rateBeer")
    public Bar RateBar() {
        return barLogic.RateBar();
    }
}
