package com.BoozeBuddies.Beer.resource;

import com.BoozeBuddies.Beer.Dal.Context.BeerContextHibernate;
import com.BoozeBuddies.Beer.Dal.Repository.BeerRepo;
import com.BoozeBuddies.Beer.logic.BeerCollectionLogic;
import com.BoozeBuddies.Beer.logic.BeerLogic;
import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/public/beer")
public class BeerResource {

    BeerCollectionLogic beerCollectionLogic = new BeerCollectionLogic(new BeerRepo(new BeerContextHibernate()));
    BeerLogic beerLogic = new BeerLogic(new BeerRepo(new BeerContextHibernate()));

    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "/editBeer")
    Beer EditBeer(@RequestBody Beer beer)
    {
        return beerLogic.UpdateBeer(beer);
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping(value = "/addBeer")
    Beer AddBeer(@RequestBody Beer beer)
    {
        return beerCollectionLogic.AddBeer(beer);
    }

    @CrossOrigin(origins = {"*"})
    @DeleteMapping(value = "/deleteBeer")
    Beer DeleteBeer(@RequestBody Beer beer) { return beerCollectionLogic.DeleteBeer(beer); }

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getById/{id}")
    Beer GetById(@PathVariable("id")int id) { return beerLogic.GetById(id);}

    @CrossOrigin(origins = {"*"})
    @GetMapping(value = "/getAllBeers")
    BeerCollection GetAllBeers() { return beerCollectionLogic.GetAllBeers();}

}
