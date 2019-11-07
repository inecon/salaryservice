package com.test.salaryservice;

class Manager extends Employee {
    @Override
    double getSalary() {
        return (getWorkdays() * getRatePerHour() * 8);
    }
}
