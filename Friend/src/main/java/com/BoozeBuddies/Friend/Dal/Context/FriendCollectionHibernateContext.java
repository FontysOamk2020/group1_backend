package com.BoozeBuddies.Friend.Dal.Context;

import com.BoozeBuddies.Friend.Dal.Interfaces.IFriendRepositoryContext;
import com.BoozeBuddies.Friend.Models.Relationship;
import com.BoozeBuddies.Friend.Models.RelationshipCollection;

import javax.persistence.*;
import java.util.List;


public class FriendCollectionHibernateContext implements IFriendRepositoryContext {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public boolean AddRelationship(Relationship relationship) {
        return false;
    }

    @Override
    public boolean DeleteRelationship(Relationship relationship) {
        return false;
    }

    @Override
    public RelationshipCollection getFriendsById(int id) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        String hql = "FROM "+ "Friend";
        TypedQuery<Relationship> typedQuery = entityManager.createQuery(hql, Relationship.class);
        List<Relationship> relationships = null;
        try {
            relationships = typedQuery.getResultList();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        RelationshipCollection relationshipCollection = new RelationshipCollection();
        relationshipCollection.setRelationships(relationships);
        return relationshipCollection;
    }

    @Override
    public boolean UpdateRelationship(Relationship relationship) {
        return false;
    }
}
