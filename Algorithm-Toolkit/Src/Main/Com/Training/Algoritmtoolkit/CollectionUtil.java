package com.training.algorithmtoolkit;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Generic Stack and Queue implementation.
 */
public class CollectionUtil<T> {

    private LinkedList<T> stack = new LinkedList<>();
    private LinkedList<T> queue = new LinkedList<>();

    // Stack operations
    public void push(T item) {
        stack.addLast(item);
    }

    public T pop() {
        if (stack.isEmpty()) throw new NoSuchElementException("Stack empty");
        return stack.removeLast();
    }

    public T peekStack() {
        if (stack.isEmpty()) throw new NoSuchElementException("Stack empty");
        return stack.getLast();
    }

    // Queue operations
    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) throw new NoSuchElementException("Queue empty");
        return queue.removeFirst();
    }

    public T peekQueue() {
        if (queue.isEmpty()) throw new NoSuchElementException("Queue empty");
        return queue.getFirst();
    }
}
