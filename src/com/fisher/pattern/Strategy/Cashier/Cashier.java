package com.fisher.pattern.Strategy.Cashier;

/**
 * 环境类Context
 */
public class Cashier {

    /**
     * 会员，策略对象
     */
    private Member member;

    public Cashier(Member member){
        this.member = member;
    }

    /**
     * 计算总价格
     * 
     * @param booksPrice 原价
     * @return 现价
     */
    public double quote(double booksPrice) {
        return this.member.calPrice(booksPrice);
    }
}
