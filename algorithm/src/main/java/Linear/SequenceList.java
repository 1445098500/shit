package Linear;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {
    private T[] elem;
    private int N;

    public SequenceList(int capacity) {
        this.elem = (T[]) new Object[capacity];
        this.N = 0;
    }

    public void clear() {
        for (int i = 0; i < N; i++) {
            elem[i] = null;
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
        return elem[i];
    }

    public void insert(int i, T t) {
        if (N == elem.length) {
            resize(2 * elem.length);
        }
        for (int index = N - 1; index >= i; index--) {
            elem[index + 1] = elem[index];
        }
        elem[i] = t;
        N++;
    }

    public void insert(T t) {
        if (N == elem.length) {
            resize(2 * elem.length);
        }
        elem[N++] = t;
    }

    public T remove(int i) {
        T t = elem[i];
        for (int index = i; index <= N - 1; index++) {
            elem[index] = elem[index + 1];
        }
        N--;
        if (N < elem.length / 4) {
            resize(elem.length / 2);
        }
        return t;
    }

    public int indexOf(T t) {
        for (int index = 0; index < N; index++) {
            if (elem[index].equals(t)) {
                return index;
            }
        }
        return -1;
    }

    public void resize(int newSize) {
        T[] temp = elem;
        elem = (T[]) new Object[newSize];
        for (int i = 0; i < N; i++) {
            elem[i] = temp[i];
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator<T> {
        private int cursor;

        public SIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < N;
        }

        @Override
        public T next() {
            return elem[cursor++];
        }
    }
}
