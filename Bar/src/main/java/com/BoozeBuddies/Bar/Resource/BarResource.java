package com.BoozeBuddies.Bar.Resource;

import com.BoozeBuddies.Bar.Logic.BarCollectionLogic;
import com.BoozeBuddies.Bar.Logic.BarLogic;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.Beer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;
import org.springframework.web.bind.annotation.*;
import com.BoozeBuddies.Bar.Dal.Repository.*;
import com.BoozeBuddies.Bar.Dal.Context.*;

@RestController
@RequestMapping(value = "api/public/bar")
public class BarResource {
    BarCollectionLogic barCollectionLogic = new BarCollectionLogic(new BarRepository(new BarContextHibernate()));
    BarLogic barLogic = new BarLogic((new BarRepository(new BarContextHibernate())));

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/addBar")
    public Bar AddBar(@RequestBody Bar bar) {
        return barCollectionLogic.AddBar(bar);
    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/editBar")
    public Bar EditBar(@RequestBody Bar bar) {
        return barCollectionLogic.EditBar(bar);
    }

    @CrossOrigin(origins = {"*"})
    @DeleteMapping(value = "/deleteBar")
    public Bar DeleteBar(@RequestBody Bar bar) {
        return barCollectionLogic.DeleteBar(bar);
    }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getAllBars")
    public BarCollection GetAllBars() {
        return barCollectionLogic.GetAllBars();
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/addBeerToBar")
    public Bar AddBeerToBar(@RequestBody Bar bar) {
        return barLogic.AddBeerToBar(bar);
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/rateBeer")
    public Bar RateBar() {
        return barLogic.RateBar();
    }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getById/{id}")
    public Bar RateBar(@PathVariable("id") int id) {
        return barLogic.GetById(id);
    }

}
