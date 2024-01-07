package com.alex.app.dao;


import com.alex.app.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> getListUsers();

    void deleteUser(Integer id);

    void updateUser(User user);
    User getUser(Integer id);
}
