package com.fisher.pattern.Strategy.Cashier;

/**
 * 具体策略类1
 */
public class PrimaryMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("没有折扣");
        return bookPrice;
    }
}
