package com.example.ExpenseTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpentDTO {
    private long id;
    private String description;
    private double mount;
    private LocalDate date;
    private String category;
}
