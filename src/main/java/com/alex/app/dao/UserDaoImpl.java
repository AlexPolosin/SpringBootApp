package com.alex.app.dao;

import com.alex.app.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) { entityManager.persist(user); }

    @Override
    public List<User> getListUsers() {

        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }


    @Override
    public void deleteUser(Integer id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(Integer id) {
        User user = entityManager.find(User.class, id);
        return user;
    }
}
