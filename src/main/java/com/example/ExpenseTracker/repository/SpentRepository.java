package com.example.ExpenseTracker.repository;

import com.example.ExpenseTracker.model.Spent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpentRepository extends JpaRepository<Spent, Long> {
    List<Spent> findByMesAndAnio(int mes, int anio);
}
