package symbol;

import java.util.Iterator;

public class OrderSymbolTable<Key extends Comparable<Key>, Value> implements Iterable<Key> {
    private Node head;
    private int N;

    public OrderSymbolTable() {
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public Value get(Key key) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.key == key) return n.value;
        }
        return null;
    }

    public void put(Key key, Value value) {
        Node p = head;
        Node n = head.next;
        while (n != null && key.compareTo(n.key) > 0) {
            p = n;
            n = n.next;
        }
        if (n != null && key.compareTo(n.key) == 0) {
            n.value = value;
        }
        p.next = new Node(key, value, n);
        N++;
    }

    public void delete(Key key) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.next.key == key) {
                n.next = n.next.next;
                N--;
                return;
            }
        }

    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<Key> iterator() {
        return null;
    }

    public class STIterator implements Iterator {
        private Node n;

        public STIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.key;
        }
    }

    public class Node {
        public Key key;
        public Value value;
        public Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
