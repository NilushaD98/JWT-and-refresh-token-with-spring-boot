package com.example.OlympicDatabase.service;

import com.example.OlympicDatabase.domain.Role;
import com.example.OlympicDatabase.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    Role addRoleToUser(String userName,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
