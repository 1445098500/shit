package Linear;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int N;

    public TwoWayLinkList() {
        this.head = new Node(null, null, null);
        this.last = null;
        this.N = 0;
    }

    public void clear() {
        Node n = head;
        while (n.next != null) {
            Node next = n.next;
            n.item = null;
            n.pre = null;
            n.next = null;
            n = next;
        }
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        if (n == null) {
            return null;
        } else {
            return n.item;
        }
    }

    public void insert(T t) {
        if (isEmpty()) {
            head.next = new Node(t, head, null);
            last = head.next;
        } else {
            last.next = new Node(t, last, null);
            last = last.next;
        }
        N++;
    }

    public void insert(int i, T t) {
        if (i == N) {
            last.next = new Node(t, last, null);
            this.last = last.next;
        } else {
            Node n = head;
            for (int index = 0; index < i; index++) {
                n = n.next;
            }
            Node newNode = new Node(t, n.next.pre, n.next);
            n.next.pre = newNode;
            n.next = newNode;
            N++;
        }
    }

    public T remove(int i) {
        if (i == N - 1) {
            T value = last.item;
            last.item = null;
            last = last.pre;
            return value;
        } else {
            Node n = head;
            for (int index = 0; index < i; index++) {
                n = n.next;
            }
            T value = n.next.item;
            n.next.item = null;
            n.next = n.next.pre;
            n.next.next.pre = n.next.next;
            N--;
            return value;
        }

    }

    public int indexOf(T t) {
        Node n = head;
        for (int index = 0; n.next != null; index++) {
            n = n.next;
            if (n.item.equals(t)) {
                return index;
            }
        }
        return -1;
    }

    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.next.item;
    }

    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return last.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    public class TIterator implements Iterator<T> {
        private Node n;

        public TIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            n = n.next;
            return n.item;
        }
    }

    private class Node {
        T item;
        Node pre;
        Node next;

        public Node(T t, Node pre, Node next) {
            this.item = t;
            this.next = next;
            this.pre = pre;
        }
    }
}
