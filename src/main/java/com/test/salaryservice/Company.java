package com.test.salaryservice;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
class Company {
    private String name;
    private Double budget;
    private List<Employee> employees = new ArrayList<>();

    void addEmploee(@NonNull Employee employee) {
        employees.add(employee);

    }

    SalaryService getSalaryService() {
        return new SalaryService();
    }
}
