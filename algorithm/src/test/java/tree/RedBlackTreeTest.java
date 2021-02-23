package tree;

public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree<Integer, Integer> tree = new RedBlackTree<>();
        for (int i = 1; i < 10; i++) {
            tree.put(i, i);
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(tree.get(i));
        }
    }
}
