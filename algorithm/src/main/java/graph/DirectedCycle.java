package graph;

public class DirectedCycle {
    private boolean[] marked;
    private boolean[] onStark;
    private boolean hasCycle;

    public DirectedCycle(Digraph G) {
        this.marked = new boolean[G.V()];
        this.hasCycle = false;
        this.onStark = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }
    }

    public boolean hasCycle() {
        return hasCycle;
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        onStark[v] = true;
        for (Integer w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
            if (onStark[w]) {
                hasCycle = true;
                return;
            }
        }
        onStark[v] = false;
    }
}
