package com.test.salaryservice;

public interface SalaryCalculation {
    default double getSalary(int workDays, Double ratePerHour, Double bonus) {
        if(bonus == null){
            return (workDays * ratePerHour * 8);
        } else {
            return ((workDays * ratePerHour * 8) + bonus);
        }
    }
}
