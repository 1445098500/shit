package uf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traffic_Project_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(Traffic_Project_Test.class.getClassLoader().getResourceAsStream("traffic_project.txt")));
        int totalNumber = Integer.parseInt(br.readLine());
        UF_Tree_Weighted uf = new UF_Tree_Weighted(totalNumber);
        int roadNumber = Integer.parseInt(br.readLine());
        for (int i = 1; i <= roadNumber; i++) {
            String line = br.readLine();
            String[] str = line.split(" ");
            int p = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);
            uf.union(p, q);
        }

        int roads = uf.count() - 1;
        System.out.println("need more" + roads);
    }
}
