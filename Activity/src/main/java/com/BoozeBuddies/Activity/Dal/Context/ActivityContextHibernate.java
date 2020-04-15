package com.BoozeBuddies.Activity.Dal.Context;

import com.BoozeBuddies.Activity.Interfaces.IActivityContext;
import com.BoozeBuddies.Activity.Model.Models.Entities.Activity;
import com.BoozeBuddies.Activity.Model.Models.Entities.ActivityScamEntity;
import com.BoozeBuddies.Activity.Model.Models.Viewmodels.ActivityCollection;

import javax.persistence.*;
import java.util.List;

public class ActivityContextHibernate implements IActivityContext {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public boolean AddActivity(ActivityScamEntity activity) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(activity);
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
        return true;
    }

    @Override
    public ActivityCollection GetAllActivities() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM Activity";
        List<Activity> activities;
        ActivityCollection activityCollection = new ActivityCollection();

        try
        {
            TypedQuery<Activity> typedQuery = entityManager.createQuery(hql, Activity.class);
            activities = typedQuery.getResultList();
            activityCollection.setActivities(activities);

        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            entityManager.close();
        }

        return activityCollection;
    }
}
