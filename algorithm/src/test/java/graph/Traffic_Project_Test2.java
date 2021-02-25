package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traffic_Project_Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(Traffic_Project_Test2.class.getClassLoader().getResourceAsStream("traffic_project.txt")));
        int totalCity = Integer.parseInt(br.readLine());
        Graph G = new Graph(totalCity);
        int roadNum = Integer.parseInt(br.readLine());
        for (int i = 1; i < roadNum; i++) {
            String[] s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            G.addEdge(v, w);
        }
        /*
        DepthFirstSearch search = new DepthFirstSearch(G,9);
        System.out.println(search.marked(8));
        System.out.println(search.marked(10));
         */
        BreadthFirstSearch search = new BreadthFirstSearch(G, 9);
        System.out.println(search.marked(8));
        System.out.println(search.marked(10));
    }
}
