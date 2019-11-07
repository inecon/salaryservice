package com.test.salaryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract class Employee {
    private String name;
    private String Surname;
    private double ratePerHour;
    private int workdays;
    private Double bonuses;

    abstract double getSalary();
}
