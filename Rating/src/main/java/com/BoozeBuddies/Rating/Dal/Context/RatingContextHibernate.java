package com.BoozeBuddies.Rating.Dal.Context;


import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.entities.BarRating;
import com.BoozeBuddies.Rating.Model.entities.BeerRating;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;

import javax.persistence.*;
import java.util.List;

public class RatingContextHibernate implements IRatingContext {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public BarRatingsCollection GetBarRatingAverage(int BarId) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM bar_rating";
        List<BarRating> barRatings;
        BarRatingsCollection barRatingsCollection = new BarRatingsCollection();

        try
        {
            TypedQuery<BarRating> typedQuery = entityManager.createQuery(hql, BarRating.class);
            barRatings = typedQuery.getResultList();
            barRatingsCollection.setBarRatings(barRatings);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            entityManager.close();
        }

        return barRatingsCollection;
    }



    @Override
    public BeerRatingCollection GetBeerRatingAverage(int BeerId) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM beer_rating";
        List<BeerRating> beerRatings;
        BeerRatingCollection beerRatingsCollection = new BeerRatingCollection();

        try
        {
            TypedQuery<BeerRating> typedQuery = entityManager.createQuery(hql, BeerRating.class);
            beerRatings = typedQuery.getResultList();
            beerRatingsCollection.setBeerRatings(beerRatings);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            entityManager.close();
        }

        return beerRatingsCollection;
    }

    @Override
    public Object AddRating(Object rating) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(rating);
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
        return rating;
    }
}
