package com.example.userservice.db.dto;

import com.example.userservice.db.entity.User;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;

}
