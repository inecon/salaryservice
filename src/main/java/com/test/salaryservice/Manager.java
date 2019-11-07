package com.test.salaryservice;

class Manager extends Employee {
    @Override
    public double getSalary() {
        return (getWorkdays() * getRatePerHour() * 8);
    }
}
