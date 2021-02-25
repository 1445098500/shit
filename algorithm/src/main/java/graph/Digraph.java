package graph;

import Linear.Queue;

public class Digraph {
    private final int V;
    private int E;
    private Queue<Integer>[] adj;

    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        E++;
    }

    public Queue<Integer> adj(int v) {
        return adj[v];
    }

    private Digraph reverse() {
        Digraph r = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (Integer w : adj[v]) {
                r.addEdge(w, v);
            }
        }
        return r;
    }
}
