package com.example.userservice.db.dto;

import com.example.userservice.db.entity.User;
import lombok.Data;

@Data
public class UserDTO {

    private Long Id;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;
}
