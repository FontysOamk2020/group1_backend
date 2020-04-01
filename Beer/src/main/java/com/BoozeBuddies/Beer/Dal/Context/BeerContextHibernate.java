package com.BoozeBuddies.Beer.Dal.Context;

import com.BoozeBuddies.Beer.interfaces.IBeerContext;
import com.BoozeBuddies.Beer.model.entities.Beer;
import com.BoozeBuddies.Beer.model.viewmodels.BeerCollection;

import javax.persistence.*;
import java.util.List;


public class BeerContextHibernate implements IBeerContext {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public Beer AddBeer(Beer beer) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(beer);
            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return beer;
    }

    @Override
    public Beer UpdateBeer(Beer beer) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.merge(beer);
            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return beer;
    }

    @Override
    public Beer DeleteBeer(Beer beer) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        Beer returnBeer = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            //returnBeer = entityManager.find(Beer.class, beer.getId());
            beer = entityManager.merge(beer);
            entityManager.remove(beer);

            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return beer;
    }

    @Override
    public BeerCollection GetAllBeers() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM Beer";
        List<Beer> beers;
        BeerCollection beerCollection = new BeerCollection();

        try
        {
            TypedQuery<Beer> typedQuery = entityManager.createQuery(hql, Beer.class);
            beers = typedQuery.getResultList();
            beerCollection.setBeers(beers);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            entityManager.close();
        }

        return beerCollection;
    }


    @Override
    public Beer GetById(int id) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        Beer beer = null;
        try {
            beer = entityManager.find(Beer.class, id);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return beer;
    }
}
