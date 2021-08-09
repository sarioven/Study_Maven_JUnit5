package com.sarioapp.junit.service;

import com.sarioapp.junit.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public boolean add(User user) {
        return users.add(user);
    }

    public List<User> getAll() {
        return users;
    }
}
