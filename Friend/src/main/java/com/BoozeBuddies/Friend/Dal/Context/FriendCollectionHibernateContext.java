package com.BoozeBuddies.Friend.Dal.Context;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Friend;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;
import com.BoozeBuddies.Friend.Models.User;

import javax.persistence.*;
import java.util.List;


public class FriendCollectionHibernateContext implements IFriendRepositoryContext {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public boolean AddRelationship(Friend relationship) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(relationship);
            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
            return false;
        }
        finally {
            entityManager.close();
        }
        return true;
    }

    @Override
    public boolean DeleteRelationship(Friend relationship) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        Friend returnRelationship = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            returnRelationship = entityManager.find(Friend.class, relationship.getId());
            entityManager.remove(returnRelationship);

            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
            return false;
        }
        finally {
            entityManager.close();
        };
        return true;
    }

    @Override
    public RelationshipCollection getFriendsById(int id) {
        User user = new User();
        user.setId(id);

        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String hql = "FROM Friend c WHERE c.userOneId = :userID OR c.userTwoId = :userID";
        TypedQuery<Friend> typedQuery = entityManager.createQuery(hql, Friend.class);
        typedQuery.setParameter("userID", user);
        List<Friend> friends = null;
        RelationshipCollection relationshipCollection = new RelationshipCollection();
        try {
            friends = typedQuery.getResultList();
            relationshipCollection.setRelationships(friends);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return relationshipCollection;
    }

    @Override
    public boolean UpdateRelationship(Friend relationship)
    {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        Friend returnRelation = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            returnRelation = entityManager.find(Friend.class, relationship.getId());
            returnRelation.setStatus(relationship.getStatus());

            entityManager.persist(returnRelation);
            entityTransaction.commit();
        }catch (Exception ex){
            if(entityTransaction != null){
                entityTransaction.rollback();
            }
            ex.printStackTrace();
            return false;
        }
        finally {
            entityManager.close();
        }
        return true;
    }
}
