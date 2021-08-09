package com.sarioapp.junit.service;

import com.sarioapp.junit.dto.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserServiceTest {

    @Test
    void usersIsEmptyIfNoUsersAdded() {
        UserService userService = new UserService();
        List<User> users = userService.getAll();
        assertTrue(users.isEmpty());
    }
}