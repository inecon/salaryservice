package com.test.salaryservice;

class Developer extends Employee {

    @Override
    public double getSalary() {
        return (getWorkdays() * getRatePerHour() * 8 + getBonuses());
    }
}
