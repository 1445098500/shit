package tree;

import Linear.Queue;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer, String> tree = new BinaryTree<>();

        tree.put(4, "4");
        tree.put(2, "2");
        tree.put(6, "6");
        tree.put(1, "1");

        tree.put(3, "3");
        tree.put(5, "5");

        tree.put(7, "7");
        /*
        //tree.delete(6);
        //System.out.println(tree.size());
        //Queue<Integer> queue = tree.preErgodic();
        //4
        //2
        //1
        //3
        //6
        //5
        //7
        //Queue<Integer> queue = tree.midErgodic();
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //Queue<Integer> queue = tree.afterErgodic();
        //1
        //3
        //2
        //5
        //7
        //6
        //4
        Queue<Integer> queue = tree.layerErgodic();
        for (Integer i :
                queue) {
            System.out.println(i);
        }

         */
        System.out.println(tree.maxDepth());


    }
}
