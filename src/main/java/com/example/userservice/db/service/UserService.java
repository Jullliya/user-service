package com.example.userservice.db.service;

import com.example.userservice.db.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User createUser(String name, String surname, String email, String password);

    User updateUser(Long id, String name, String surname, String email, String password);

    User getUserById(Long id);

    void deleteUserById(Long id);
}
