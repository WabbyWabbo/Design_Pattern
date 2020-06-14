package com.fisher.pattern.Strategy.Salary;

public class SalariedClassification implements PaymentClassification {

    private double salary;

    public SalariedClassification(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
