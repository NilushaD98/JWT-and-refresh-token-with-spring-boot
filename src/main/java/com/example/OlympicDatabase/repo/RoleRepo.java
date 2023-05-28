package com.example.OlympicDatabase.repo;

import com.example.OlympicDatabase.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findRoleByNameEquals(String roleName);
}
