package com.example.ExpenseTracker.repository;

import com.example.ExpenseTracker.model.Spent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SpentRepository extends JpaRepository<Spent, Long> {
    List<Spent> findByDate(LocalDate date);
}
