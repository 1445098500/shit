package uf;

import java.util.Scanner;

public class UF_Tree_WeightedTest {
    public static void main(String[] args) {
        UF_Tree_Weighted uf = new UF_Tree_Weighted(20);
        System.out.println("Group:" + uf.count());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("first element");
            int p = scanner.nextInt();
            System.out.println("second element");
            int q = scanner.nextInt();
            if (uf.connected(p, q)) {
                System.out.println(p + "," + q + "connected!");
                continue;
            }
            uf.union(p, q);
            System.out.println("group" + uf.count());
        }
    }
}
