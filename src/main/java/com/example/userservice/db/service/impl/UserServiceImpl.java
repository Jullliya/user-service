package com.example.userservice.db.service.impl;

import com.example.userservice.db.entity.User;
import com.example.userservice.db.repository.UserRepository;
import com.example.userservice.db.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    @Override
    public User createUser(String name, String surname, String email, String password){
        User user = newUser(name, surname, email, password);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, String name, String surname, String email, String password) {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
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
