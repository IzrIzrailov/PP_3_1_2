package ru.kata.boot.web.dao;

import ru.kata.boot.web.model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void removeUser(long id);
}