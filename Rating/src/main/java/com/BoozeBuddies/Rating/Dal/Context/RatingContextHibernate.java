package com.BoozeBuddies.Rating.Dal.Context;


import com.BoozeBuddies.Rating.Interface.IRatingContext;
import com.BoozeBuddies.Rating.Model.Rating;
import com.BoozeBuddies.Rating.Model.entities.BarRating;
import com.BoozeBuddies.Rating.Model.entities.BarRatingScam;
import com.BoozeBuddies.Rating.Model.entities.BeerRating;
import com.BoozeBuddies.Rating.Model.entities.BeerRatingScam;
import com.BoozeBuddies.Rating.Model.viewmodels.BarRatingsCollection;
import com.BoozeBuddies.Rating.Model.viewmodels.BeerRatingCollection;

import javax.persistence.*;
import java.util.List;

public class RatingContextHibernate implements IRatingContext {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public BarRatingsCollection GetBarRatingAverage(int BarId) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM BarRatingScam";
        List<BarRatingScam> barRatings;
        BarRatingsCollection barRatingsCollection = new BarRatingsCollection();

        try
        {
            TypedQuery<BarRatingScam> typedQuery = entityManager.createQuery(hql, BarRatingScam.class);
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
        String hql = "FROM BeerRatingScam";
        List<BeerRatingScam> beerRatings;
        BeerRatingCollection beerRatingsCollection = new BeerRatingCollection();

        try
        {
            TypedQuery<BeerRatingScam> typedQuery = entityManager.createQuery(hql, BeerRatingScam.class);
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
    public Object AddBarRating(Rating rating) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        BarRatingScam barRating = new BarRatingScam(rating);

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(barRating);
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

    @Override
    public Object AddBeerRating(Rating rating) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        BeerRatingScam beerRating = new BeerRatingScam(rating);

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(beerRating);
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
