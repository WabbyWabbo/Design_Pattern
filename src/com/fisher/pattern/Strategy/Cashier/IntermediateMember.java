package com.fisher.pattern.Strategy.Cashier;

/**
 * 具体策略类2
 */
public class IntermediateMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("中级会员打九折");
        return bookPrice * 0.9;
    }
}
