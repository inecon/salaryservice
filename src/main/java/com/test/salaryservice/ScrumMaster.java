package com.test.salaryservice;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
class ScrumMaster extends Employee {
    @Override
    double getSalary() {
        return (getWorkdays() * getRatePerHour() * 8);
    }
}
