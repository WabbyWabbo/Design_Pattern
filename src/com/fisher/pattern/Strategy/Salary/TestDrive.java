package com.fisher.pattern.Strategy.Salary;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class TestDrive {

    public static void main(String[] args) {
        //创建Employee对象
        Employee jack = new Employee("jack", 0);
        Employee tom = new Employee("tom",1);

        //创建不同的具体策略
        SalariedClassification sc = new SalariedClassification(3000);
        HourlyClassification hc = new HourlyClassification(10,40);

        MonthlySchedule ms = new MonthlySchedule(21);
        WeeklySchedule ws = new WeeklySchedule(2012,Calendar.FEBRUARY,22);

        //配置Employee对象，通过构造函数也可以，这里用的是setter
        jack.setPaymentClassification(sc);
        jack.setPaymentSchedule(ms);

        tom.setPaymentClassification(hc);
        tom.setPaymentSchedule(ws);

        //使用
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(jack);
        employeeArrayList.add(tom);

        Iterator<Employee> it = employeeArrayList.iterator();

        while(it.hasNext()){
            Employee e = it.next();
            System.out.print("for " + e.getname() + ", ");
            if (e.isPayDay()) {
                System.out.println("the payment is: " + e.getPayment() + ".");
            }else{
                System.out.println("it is not PayDay.");
            }
        }
    }

}
