package com.test.salaryservice;

class SalaryServise {
    private final String NOT_ENOUGH_BUDGET = "Company cannot pay salaries: Budget exceeded";

    void pay(Company company) {
        Double sumOfSalaries = 0.00;
        for (Employee emploee : company.getEmployees()) {
            sumOfSalaries += emploee.getSalary();
        }
        if (company.getBudget() >= sumOfSalaries) {
            // implement paying process in real app
            System.out.println("Company payed to all employees:  " + sumOfSalaries + " USD");
        } else {
            // implement paying process in real app
            System.out.println(NOT_ENOUGH_BUDGET);
        }
    }
}