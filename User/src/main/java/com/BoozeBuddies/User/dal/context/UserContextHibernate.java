package com.BoozeBuddies.User.dal.context;

import com.BoozeBuddies.User.interfaces.IUserCollectionRepo;
import com.BoozeBuddies.User.interfaces.IUserContext;
import com.BoozeBuddies.User.interfaces.IUserRepo;
import com.BoozeBuddies.User.model.UpdateUser;
import com.BoozeBuddies.User.model.User;
import javax.persistence.*;
import java.util.List;

public class UserContextHibernate implements IUserContext {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Oulu");

    @Override
    public User addUser(User user) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(user);
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
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        String hql = "FROM User";
        TypedQuery<User> typedQuery = entityManager.createQuery(hql, User.class);
        List<User> users = null;
        try {
         users = typedQuery.getResultList();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        String hql = "SELECT c FROM User c WHERE c.id = :userID";
        TypedQuery<User> typedQuery = entityManager.createQuery(hql, User.class);
        typedQuery.setParameter("userID", id);
        User user = null;
        try {
            user = typedQuery.getSingleResult();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return user;
    }

    @Override
    public User getUserByEmail(String email) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        String hql = "SELECT c FROM User c WHERE c.email = :userEMAIL";
        TypedQuery<User> typedQuery = entityManager.createQuery(hql, User.class);
        typedQuery.setParameter("userEMAIL", email);
        User user = null;
        try {
            user = typedQuery.getSingleResult();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return user;
    }


    @Override
    public User updateUsername(UpdateUser updateUser) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        User returnUser = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            returnUser = entityManager.find(User.class, updateUser.getId());
            returnUser.setName(updateUser.getNewUsername());

            entityManager.persist(returnUser);
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
        return returnUser;
    }

    @Override
    public boolean deleteUser(User user) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        User returnUser = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            returnUser = entityManager.find(User.class, user.getId());
            entityManager.remove(returnUser);

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
}
