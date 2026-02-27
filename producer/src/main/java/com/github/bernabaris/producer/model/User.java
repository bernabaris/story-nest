package com.github.bernabaris.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private boolean admin;
    private boolean active;

    private LocalDateTime createdAt;

    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
