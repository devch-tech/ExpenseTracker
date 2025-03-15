package com.example.ExpenseTracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table (name="spent")
public class Spent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String description;

    @Column
    private double mount;

    @Column(name="date_of_spent")
    private LocalDate date;

    @Column
    private String category;
}
