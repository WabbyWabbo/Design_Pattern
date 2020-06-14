package com.fisher.pattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        MyObservable myObservable = (MyObservable) o;
        System.out.println("data has changed to " + myObservable.getData());
    }
}
