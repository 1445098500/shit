package uf;

import java.util.Scanner;

public class UFTest {
    public static void main(String[] args) {
        UF uf = new UF(10);
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
