package com.example.staffvisitorproject.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;

    private String phoneNumber;

    private String emailAddress;

    private String homeAddress;

    private String username;

    private String password;
}
