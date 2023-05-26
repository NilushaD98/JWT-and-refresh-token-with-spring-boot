package com.example.OlympicDatabase.repo;

import com.example.OlympicDatabase.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findRoleByNameEquals(String roleName);
}
