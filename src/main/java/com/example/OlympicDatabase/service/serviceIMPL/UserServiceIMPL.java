package com.example.OlympicDatabase.service.serviceIMPL;

import com.example.OlympicDatabase.domain.Role;
import com.example.OlympicDatabase.domain.User;
import com.example.OlympicDatabase.repo.RoleRepo;
import com.example.OlympicDatabase.repo.UserRepo;
import com.example.OlympicDatabase.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Override

    public User saveUser(User user) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {

    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
