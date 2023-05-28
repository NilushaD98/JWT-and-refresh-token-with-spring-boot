package com.example.OlympicDatabase.repo;

import com.example.OlympicDatabase.domain.JWTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface JwtRepoFor extends JpaRepository<JWTokenEntity,Long> {
}
