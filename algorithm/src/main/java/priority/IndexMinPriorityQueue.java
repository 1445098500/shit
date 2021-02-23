package priority;

import java.util.Arrays;

public class IndexMinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    //保存每个元素在items数组中的索引，pq数组需要堆有序
    private int[] pq;
    //保存pq的逆序，pq的值作为索引，pq的索引作为值
    private int[] qp;
    private int N;

    public IndexMinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.pq = new int[capacity + 1];
        this.qp = new int[capacity + 1];
        this.N = 0;
        Arrays.fill(qp, -1);
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean less(int i, int j) {
        return items[pq[i]].compareTo(items[pq[j]]) < 0;
    }

    public void exchange(int i, int j) {
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;

        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    public boolean contains(int k) {
        return qp[k] != -1;
    }

    public int minIndex() {
        return pq[1];
    }

    public void insert(int i, T t) {
        if (contains(i)) {
            return;
        }
        N++;
        items[i] = t;
        pq[N] = i;
        qp[i] = N;
        swim(N);
    }

    public int delMin() {
        int min = pq[1];
        exchange(1, N);
        qp[pq[N]] = -1;
        items[pq[N]] = null;
        pq[N] = -1;
        N--;
        sink(1);
        return min;
    }

    public void delete(int i) {
        int k = qp[i];
        exchange(k, N);
        qp[pq[N]] = -1;
        items[pq[N]] = null;
        pq[N] = -1;

        N--;
        swim(k);
        sink(k);
    }

    public void changeItem(int i, T t) {
        items[i] = t;
        int k = qp[i];
        swim(k);
        sink(k);
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k, k / 2)) {
                exchange(k, k / 2);
            }
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int min;
            if (2 * k + 1 <= N) {
                if (less(2 * k + 1, 2 * k)) {
                    min = 2 * k + 1;
                } else {
                    min = 2 * k;
                }
            } else {
                min = 2 * k;
            }
            if (less(k, min)) {
                break;
            }
            exchange(k, min);
            k = min;
        }
    }
}
