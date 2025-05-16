package com.SpringBoot_base.SpringBoot_base.service.implementation;

import com.SpringBoot_base.SpringBoot_base.entity.User;
import com.SpringBoot_base.SpringBoot_base.repository.UserInterface;
import com.SpringBoot_base.SpringBoot_base.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUser {

    private final UserInterface userRepository;

    @Autowired
    public UserServiceImpl(UserInterface userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
