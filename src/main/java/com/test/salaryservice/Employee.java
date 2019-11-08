package com.test.salaryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee implements SalaryCalculation {
    private String name;
    private String surname;
    private Double ratePerHour;
    private int workdays;
    private Double bonuses;
    private Role role;

    Employee(String name, String surname, double ratePerHour, int workdays, Role role) {
        this.name = name;
        this.surname = surname;
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.role = role;
    }
}
