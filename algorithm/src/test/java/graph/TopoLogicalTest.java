package graph;

import Linear.Stack;

public class TopoLogicalTest {
    public static void main(String[] args) {
        Digraph G = new Digraph(6);
        G.addEdge(0, 2);
        G.addEdge(0, 3);
        G.addEdge(2, 4);
        G.addEdge(3, 4);
        G.addEdge(4, 5);
        G.addEdge(1, 3);
        TopoLogical topoLogical = new TopoLogical(G);
        Stack<Integer> order = topoLogical.order();
        StringBuilder sb = new StringBuilder();
        for (Integer integer : order) {
            sb.append(integer + "->");
        }
        String string = sb.toString();
        int index = string.lastIndexOf("->");
        string = string.substring(0, index);
        System.out.println(string);
    }
}
