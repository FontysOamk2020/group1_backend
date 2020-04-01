package com.BoozeBuddies.Bar.Dal.Context;

import com.BoozeBuddies.Bar.Interface.IBarContext;
import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.entities.Beer;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;

import javax.persistence.*;
import java.util.List;

public class BarContextHibernate implements IBarContext{
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public Bar AddBar(Bar bar) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(bar);
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
        return bar;
    }

    @Override
    public Bar EditBar(Bar bar) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.merge(bar);
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
        return bar;
    }

    @Override
    public Bar DeleteBar(Bar bar) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        Beer returnBeer = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            returnBeer = entityManager.find(Beer.class, bar.getId());
            entityManager.remove(returnBeer);

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
        return bar;
    }

    @Override
    public BarCollection GetAllBars() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM Bar";
        List<Bar> bars;
        BarCollection barCollection = new BarCollection();

        try
        {
            TypedQuery<Bar> typedQuery = entityManager.createQuery(hql, Bar.class);
            bars = typedQuery.getResultList();
            barCollection.setBars(bars);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            entityManager.close();
        }

        return barCollection;
    }


    @Override
    public Bar AddBeerToBar(Bar bar) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.merge(bar);
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
        return bar;
    }

    @Override
    public Bar RateBar() {
        return null;
    }
}
