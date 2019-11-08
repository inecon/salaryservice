package com.test.salaryservice;

class NotEnoughBudgetException extends RuntimeException {
    NotEnoughBudgetException(String msg) {
        super(msg);
    }
}
