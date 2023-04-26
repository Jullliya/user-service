package com.example.userservice.db.controller;

import com.example.userservice.db.dto.UserDTO;
import com.example.userservice.db.entity.User;
import com.example.userservice.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class Controller {

    private UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
      User user = userService.createUser(userDTO.getName(), userDTO.getSurname(), userDTO.getEmail(), userDTO.getPassword());
        return ResponseEntity.ok(user);
    };

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@RequestBody UserDTO userDTO) {
        User user = userService.updateUser(userDTO.getId(), userDTO.getName(), userDTO.getSurname(), userDTO.getEmail(), userDTO.getPassword());
        return ResponseEntity.ok(user);
    };

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    };

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    };

}