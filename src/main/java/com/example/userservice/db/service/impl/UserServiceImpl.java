package com.example.userservice.db.service.impl;

import com.example.userservice.db.entity.User;
import com.example.userservice.db.repository.UserRepository;
import com.example.userservice.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String name, String surname, String email, String password){
        User user = newUser(name, surname, email, password);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, String name, String surname, String email, String password) {
        User user = newUser(name, surname, email, password);
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    private User newUser(String name, String surname, String email, String password){
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

}
