package com.test.salaryservice;

class SalaryService {
    private final String errorMessage = "com.test.salaryservice.Company cannot pay salaries: Budget exceeded";

    void pay(Company company) {
        Double sumOfSalaries = 0.00;
        for (Employee emploee : company.getEmployees()) {
            sumOfSalaries += emploee.getSalary();
        }
        if (company.getBudget() >= sumOfSalaries) {
            // implement paying process in real app
            System.out.println("com.test.salaryservice.Company payed to all employees:  " + sumOfSalaries + " USD");
        } else {
            throw new NotEnoughBudgetException(errorMessage);
        }
    }
}