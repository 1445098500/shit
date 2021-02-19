package Linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
    private Node head;
    private int N;


    public LinkList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public void clear() {
        Node n = head;
        while (n.next != null) {
            Node next = n.next;
            n.item = null;
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
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    public void insert(int i, T t) {
        Node n = head;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        Node newNode = new Node(t, n.next);
        n.next = newNode;
        N++;
    }

    public T remove(int i) {
        Node n = head;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        T value = n.next.item;
        n.next = n.next.next;
        N--;
        return value;
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

    public void reverse() {
        if (isEmpty()) {
            return;
        }

        reverse(head.next);
    }

    public Node reverse(Node e) {
        if (e.next == null) {
            head.next = e;
            return e;
        }
        Node pre = reverse(e.next);
        pre.next = e;
        e.next = null;
        return e;
    }

    public T getMid() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.item;
    }

    public boolean isCircle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node getEntrance() {
        Node fast = head;
        Node slow = head;
        Node temp = null;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow && count == 0) {
                temp = head;
                count = 1;
                continue;
            }

            if (temp != null) {
                temp = temp.next;
                if (temp == slow) {
                    break;
                }
            }

        }
        return temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    public class LIterator implements Iterator<T> {
        private Node n;

        public LIterator() {
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
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }


}
