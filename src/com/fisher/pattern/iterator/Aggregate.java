package com.fisher.pattern.iterator;

public interface Aggregate<T> {
    public void add(T data);

    public Iterator iterator();
}
