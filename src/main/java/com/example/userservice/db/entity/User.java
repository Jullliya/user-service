package com.example.userservice.db.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
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

}
