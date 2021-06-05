package com.example.vsucs.repositories;

import com.example.vsucs.entities.Clerk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClerkRepository extends JpaRepository<Clerk, Long> {
    Optional<Clerk> getClerkByExperienceIsGreaterThanEqual(int experience);
}
