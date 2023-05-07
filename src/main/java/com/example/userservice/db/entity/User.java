package com.example.userservice.db.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Name", length = 32, nullable = false)
    private String name = "Name";

    @Column(name = "Surname", length = 32, nullable = false)
    private String surname = "Surname";

    @Column(name = "Email", length = 24, nullable = false)
    private String email = "email@gmail.com";

    @Column(name = "Password", length = 16, nullable = false)
    private String password = "password";

    public User(String name, String surname, String email, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    };

}
