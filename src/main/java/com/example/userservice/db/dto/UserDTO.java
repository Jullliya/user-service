package com.example.userservice.db.dto;

import com.example.userservice.db.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private List<Long> meetsId;

    public UserDTO(User user)
    {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

}
