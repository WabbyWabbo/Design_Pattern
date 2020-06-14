package com.fisher.pattern.Builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder commonBuilder = new CommonRoleBuilder();

        //这个director指定要这个commonBuilder去建造
        director.construct(commonBuilder);
        //建造完成之后,commonBuilder中的getResult()方法会将建造好的成品返回
        Role commonRole = commonBuilder.getResult();
        
        System.out.println(commonRole);

    }
}
/**
 * 建造者模式将将建造复杂对象的过程和组成对象的部件解耦
 * director封装了创建各部件的顺序，且面向抽象类Builder编程
 * 各个部件的具体建造是由不同的builder完成的
 * 
 * 
 * 客户端只需要知道具体builder的类型，即可通过director调用建造者的相关方法，返回一个完整的产品对象。
 */