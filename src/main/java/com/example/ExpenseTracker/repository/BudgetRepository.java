package com.example.ExpenseTracker.repository;

import com.example.ExpenseTracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Optional<Budget> findByMesAndAnio(int mes, int anio);
}
