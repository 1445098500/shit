package uf;

import java.util.Arrays;

public class UF_Tree_Weighted {
    private int[] eleAndGroup;
    private int count;
    private int[] sz;

    public UF_Tree_Weighted(int N) {
        this.count = N;

        this.eleAndGroup = new int[N];

        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }

        this.sz = new int[N];

        Arrays.fill(sz, 1);

    }

    public int count() {
        return count;
    }

    public int find(int p) {
        while (true) {
            if (p == eleAndGroup[p]) {
                return p;
            }
            p = eleAndGroup[p];
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        if (sz[pRoot] < sz[qRoot]) {
            eleAndGroup[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            eleAndGroup[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        this.count--;
    }
}
