package com.SpringBoot_base.SpringBoot_base.service;

import com.SpringBoot_base.SpringBoot_base.entity.User;

import java.util.List;

public interface IUser {
    List<User> getAllUsers();
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(int id);

}
