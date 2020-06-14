package com.fisher.pattern.Strategy.Salary;

import java.util.Calendar;
import java.util.Date;

public class MonthlySchedule implements PaymentSchedule {
    private int dayOfMonth;

    public MonthlySchedule(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public boolean isPayDay() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        boolean flag = false;
        if(calendar.get(Calendar.DAY_OF_MONTH) == dayOfMonth){
            flag = true;
        }
        return flag;
    }
}
