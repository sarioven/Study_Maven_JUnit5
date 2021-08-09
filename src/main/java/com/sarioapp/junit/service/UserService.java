package com.sarioapp.junit.service;

import com.sarioapp.junit.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserService {
    List<User> users = new ArrayList<>();

    public boolean add(User user) {
        return users.add(user);
    }

    public List<User> getAll() {
        return users;
    }

    public Optional<User> login(String username, String password) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
    }
}
