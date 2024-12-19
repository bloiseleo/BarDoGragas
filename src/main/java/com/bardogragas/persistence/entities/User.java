package com.bardogragas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String profileIconName;
    public User() {}
    public User(String name, String email, String password, String profileIconName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.profileIconName = profileIconName;
    }
}
