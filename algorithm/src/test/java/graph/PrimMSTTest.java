package graph;

import Linear.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimMSTTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(PrimMSTTest.class.getClassLoader().getResourceAsStream("min_create_tree_test.txt")));
        int nodeNum = Integer.parseInt(br.readLine());
        EdgeWeightGraph G = new EdgeWeightGraph(nodeNum);
        int edgeNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < edgeNum; i++) {
            String s = br.readLine();
            int v = Integer.parseInt(s.split(" ")[0]);
            int w = Integer.parseInt(s.split(" ")[1]);
            double weight = Double.parseDouble(s.split(" ")[2]);
            G.addEdge(new Edge(v, w, weight));
        }
        PrimMST mst = new PrimMST(G);
        Queue<Edge> edges = mst.edges();
        for (Edge edge : edges) {
            System.out.println(edge.either() + ":" + edge.other(edge.either()) + "::" + edge.weight());
        }
    }
}
