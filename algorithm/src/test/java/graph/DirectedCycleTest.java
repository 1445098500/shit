package graph;

public class DirectedCycleTest {
    public static void main(String[] args) {
        Digraph G = new Digraph(5);
        G.addEdge(3, 4);
        G.addEdge(0, 1);
        G.addEdge(1, 2);
        G.addEdge(2, 0);
        DirectedCycle cycle = new DirectedCycle(G);
        System.out.println(cycle.hasCycle());
    }
}
