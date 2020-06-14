package com.fisher.pattern.iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private Node<T> head;
    private Node<T> p;

    public ConcreteIterator(Node<T> head) {
        this.head = head;
        this.p = this.head;
    }

    @Override
    public boolean hasNext() {
        return p.next != null;
    }

    @Override
    public T next() {
        p = p.next;
        return p.getData();
    }
}
