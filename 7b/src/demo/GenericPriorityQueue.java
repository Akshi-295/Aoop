package demo;

import java.util.PriorityQueue;

public class GenericPriorityQueue<T> {
    private PriorityQueue<T> queue;

    public GenericPriorityQueue() {
        queue = new PriorityQueue<>();
    }

    public void add(T item) {
        queue.add(item);
    }

    public T remove() {
        return queue.poll();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
