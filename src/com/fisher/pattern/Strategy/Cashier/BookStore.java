package com.fisher.pattern.Strategy.Cashier;

/**
 * 客户端测试程序
 */
public class BookStore {

    public static void main(String[] args) {

        //选择并创建需要使用的策略对象
        Member strategy = new AdvancedMember();
        //创建环境
        Cashier cashier = new Cashier(strategy);
        //计算价格
        double quote = cashier.quote(300);
        System.out.println("高级会员图书的最终价格为：" + quote);

        strategy = new IntermediateMember();
        cashier = new Cashier(strategy);
        quote = cashier.quote(300);
        System.out.println("中级会员图书的最终价格为：" + quote);
    }
}
/*
 * new的是一个ConcreteStrategy对象，但是声明为Strategy类型
 * context接收这个new出来的策略对象（通过组合）
 * context对象中的quote()方法具体执行哪一种策略是看他组合在内的那个策略对象是如何规定的
 */