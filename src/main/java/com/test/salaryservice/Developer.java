package com.test.salaryservice;

class Developer extends Employee {

    @Override
    double getSalary() {
        return (getWorkdays() * getRatePerHour() * 8 + getBonuses());
    }
}
