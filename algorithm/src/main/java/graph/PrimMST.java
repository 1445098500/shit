package graph;

import Linear.Queue;
import priority.IndexMinPriorityQueue;

public class PrimMST {
    private Edge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    private IndexMinPriorityQueue<Double> pq;

    public PrimMST(EdgeWeightGraph G) {
        this.edgeTo = new Edge[G.V()];
        this.distTo = new double[G.V()];
        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        this.marked = new boolean[G.V()];
        this.pq = new IndexMinPriorityQueue<Double>(G.V());
        distTo[0] = 0.0;
        pq.insert(0, 0.0);
        while (!pq.isEmpty()) {
            visit(G, pq.delMin());
        }
    }

    private void visit(EdgeWeightGraph G, int v) {
        marked[v] = true;
        for (Edge e : G.adj(v)) {
            int w = e.other(v);
            if (marked[w]) {
                continue;
            }
            if (e.weight() < distTo[w]) {
                edgeTo[w] = e;
                distTo[w] = e.weight();
                if (pq.contains(w)) {
                    pq.changeItem(w, e.weight());
                } else {
                    pq.insert(w, e.weight());
                }
            }
        }
    }

    public Queue<Edge> edges() {
        Queue<Edge> queue = new Queue<>();
        for (int i = 0; i < edgeTo.length; i++) {
            if (edgeTo[i] != null) {
                queue.enqueue(edgeTo[i]);
            }
        }
        return queue;
    }
}
