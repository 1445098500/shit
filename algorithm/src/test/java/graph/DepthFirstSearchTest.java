package graph;

public class DepthFirstSearchTest {
    public static void main(String[] args) {
        Graph G = new Graph(13);
        G.addEdge(0, 5);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(0, 6);
        G.addEdge(5, 3);
        G.addEdge(5, 4);
        G.addEdge(3, 4);
        G.addEdge(4, 6);

        G.addEdge(7, 8);

        G.addEdge(9, 10);
        G.addEdge(9, 11);
        G.addEdge(9, 12);
        G.addEdge(11, 12);

        DepthFirstSearch search = new DepthFirstSearch(G, 0);

        int count = search.count();

        System.out.println(count);
        System.out.println(search.marked(7));
        System.out.println(search.marked(3));

    }
}
