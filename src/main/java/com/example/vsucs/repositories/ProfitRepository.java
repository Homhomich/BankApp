package com.example.vsucs.repositories;

import com.example.vsucs.entities.Profit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfitRepository extends JpaRepository<Profit, Long> {
    Optional<Profit> findByClerkId(Long aLong);
}
