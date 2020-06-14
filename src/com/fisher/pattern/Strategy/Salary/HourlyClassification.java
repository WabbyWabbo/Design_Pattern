package com.fisher.pattern.Strategy.Salary;

public class HourlyClassification implements PaymentClassification{

    private double hourlyRate;
    private double hours;

    public HourlyClassification(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hours;
    }
}
