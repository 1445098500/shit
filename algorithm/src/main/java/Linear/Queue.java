package Linear;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int N;

    public Queue() {
        this.head = new Node(null, null);
        this.last = null;
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        Node n = head.next;
        T t = n.item;
        head.next = n.next;
        n.item = null;
        n.next = null;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return t;
    }

    public void enqueue(T t) {
        Node newNode = new Node(t, null);
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
        last = newNode;
        N++;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator {
        private Node n;

        public QIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }

    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
