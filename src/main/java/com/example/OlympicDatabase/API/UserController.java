package com.example.OlympicDatabase.API;

import com.example.OlympicDatabase.domain.Role;
import com.example.OlympicDatabase.domain.User;
import com.example.OlympicDatabase.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getAllUsers")
    public ResponseEntity<List<User>> getALLUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }
    @PostMapping("user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.created(null).body(userService.saveUser(user));
    }
    @PostMapping("role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        return ResponseEntity.ok().body(userService.saveRole(role));
    }
    @PostMapping("role/addToUser")
    public ResponseEntity<Role> addRoleToUser(@RequestBody RoleTOUserForm roleTOUserForm){
        return ResponseEntity.ok().body(userService.addRoleToUser(roleTOUserForm.userName, roleTOUserForm.roleName));
    }

    @Data
    class RoleTOUserForm{
        private String userName;
        private String roleName;
    }
}
