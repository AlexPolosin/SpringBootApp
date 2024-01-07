package com.alex.app.service;

import com.alex.app.dao.UserDao;
import com.alex.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) { userDao.addUser(user); }

    @Override
    @Transactional
    public List<User> getListUsers() { return userDao.getListUsers(); }

    @Override
    @Transactional
    public void deleteUser(Integer id) { userDao.deleteUser(id); }

    @Override
    @Transactional
    public void updateUser(User user) { userDao.updateUser(user); }

    @Override
    @Transactional
    public User getUser(Integer id) { return userDao.getUser(id); }
}
