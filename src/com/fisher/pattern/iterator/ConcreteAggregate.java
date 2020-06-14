package com.fisher.pattern.iterator;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private Node<T> head = new Node();
    private Node<T> p = head;

    public void add(T data) {
        p.next = new Node<>(data);
        p = p.next;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.head);
    }

}

class Node<T> {
    private T data;
    Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}