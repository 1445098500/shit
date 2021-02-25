package graph;

import Linear.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepthFirstPathsTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(DepthFirstPathsTest.class.getClassLoader().getResourceAsStream("road_find.txt")));
        int nodeNum = Integer.parseInt(br.readLine());
        Graph G = new Graph(nodeNum);
        int roadNum = Integer.parseInt(br.readLine());
        for (int i = 1; i <= roadNum; i++) {
            String[] s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            G.addEdge(v, w);
        }
        DepthFirstPaths paths = new DepthFirstPaths(G, 0);
        Stack<Integer> stack = paths.pathTo(4);
        for (Integer a : stack) {
            System.out.println(a);
        }
    }
}
