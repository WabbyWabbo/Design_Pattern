package com.fisher.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);
        aggregate.add(5);
        aggregate.add("hello");

        /**
         * 无论聚合容器的内部实现怎么改动，都不会影响到client的代码
         * 改动被局限在了ConcreteAggreate和ConcreteIterator中
         */
        for (Iterator it = aggregate.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
