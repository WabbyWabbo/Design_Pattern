package com.fisher.pattern.Observer;

public class Test {
    public static void main(String[] args) {
        MyObservable num = new MyObservable();
//        num.addObserver(new MyObserver());

        num.changeData(1);
        num.changeData(2);
        num.changeData(3);
    }
}
