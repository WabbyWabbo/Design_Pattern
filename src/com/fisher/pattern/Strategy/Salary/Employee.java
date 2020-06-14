package com.fisher.pattern.Strategy.Salary;

public class Employee {
    private String name;
    private int ID;
    private PaymentClassification pc;
    private PaymentSchedule ps;

    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setPaymentClassification(PaymentClassification pc) {
        this.pc = pc;
    }

    public void setPaymentSchedule(PaymentSchedule ps) {
        this.ps = ps;
    }

    public double getPayment(){
        return pc.calculatePayment();
    }

    public boolean isPayDay(){
        return ps.isPayDay();
    }

}
