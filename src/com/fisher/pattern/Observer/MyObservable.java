package com.fisher.pattern.Observer;

import java.util.Observable;

public class MyObservable extends Observable {
    private int data = 0;

    public void changeData(int i){
        data = i;
        //标记此Observable对象已改变
        setChanged();
        //通知所有Observer
        notifyObservers();
    }

    public int getData(){
        return data;
    }
}

