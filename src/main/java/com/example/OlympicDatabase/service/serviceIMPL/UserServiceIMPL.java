package com.example.OlympicDatabase.service.serviceIMPL;

import com.example.OlympicDatabase.domain.Role;
import com.example.OlympicDatabase.domain.User;
import com.example.OlympicDatabase.repo.RoleRepo;
import com.example.OlympicDatabase.repo.UserRepo;
import com.example.OlympicDatabase.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceIMPL implements UserService, UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override

    public User saveUser(User user) {
        log.info("user {} saved.",user.getName());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
    @Override
    public Role saveRole(Role role) {
        log.info("role {} saved.",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public Role addRoleToUser(String userName, String roleName) {
        log.info("Add role {} to {}",roleName,userName);
        User user = userRepo.findUserByUsernameEquals(userName);
        Role role = roleRepo.findRoleByNameEquals(roleName);
        user.getRoles().add(role);
        return role;
    }

    @Override
    public User getUser(String username) {
        log.info("Fetch user {}",username);
        return userRepo.findUserByUsernameEquals(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("fetching all users.");
        return userRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findUserByUsernameEquals(username);
        if(user == null){
            log.error("User not in database");
            throw new UsernameNotFoundException("User not in database");
        }else{
            log.info("User found in database");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(
                role -> {
                    authorities.add(new SimpleGrantedAuthority(role.getName()));
                }
        );
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),authorities);
    }
}
