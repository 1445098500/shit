package graph;

import Linear.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;
    private Queue<Integer> waitSearch;

    public BreadthFirstSearch(Graph G, int s) {
        this.marked = new boolean[G.V()];
        this.count = 0;
        this.waitSearch = new Queue<Integer>();
        bfs(G, s);
    }

    private void bfs(Graph G, int v) {
        marked[v] = true;
        count++;
        waitSearch.enqueue(v);
        while (!waitSearch.isEmpty()) {
            Integer wait = waitSearch.dequeue();
            for (Integer w : G.adj(wait)) {
                if (!marked[w]) {
                    marked[w] = true;
                    waitSearch.enqueue(w);
                    count++;
                }

            }
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }
}
