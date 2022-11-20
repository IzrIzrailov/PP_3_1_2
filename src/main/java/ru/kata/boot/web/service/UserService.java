package ru.kata.boot.web.service;

import ru.kata.boot.web.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    Object getUserById(long id);

    void updateUser(@Valid User user);

    void removeUser(long id);
}