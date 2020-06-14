package com.fisher.pattern.Strategy.Cashier;

/**
 * 具体策略类3
 */
public class AdvancedMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("高级会员打八折");
        return bookPrice * 0.8;
    }
}
