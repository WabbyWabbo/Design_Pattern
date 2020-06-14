package com.fisher.pattern.Strategy.Salary;

import java.util.Calendar;

/**
 * 每周三支付
 */
public class WeeklySchedule implements PaymentSchedule {

    private int year;
    private int month;
    private int date;

    public WeeklySchedule(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public boolean isPayDay() {
        Calendar cal = Calendar.getInstance();

        cal.set(year,month,date);

        int weekDay = cal.get(Calendar.DAY_OF_WEEK);

        boolean flag = false;
        //4代表星期三
        if (weekDay == 4) {
            flag = true;
        }
        return flag;


    }

}
