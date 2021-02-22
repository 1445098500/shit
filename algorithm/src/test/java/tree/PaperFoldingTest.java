package tree;

import Linear.Queue;

public class PaperFoldingTest {

    public static void main(String[] args) {
        Node<String> tree = creatTree(3);
        printTree(tree);
    }


    public static Node<String> creatTree(int N) {
        Node<String> root = null;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                root = new Node<>("down", null, null);
                continue;
            }

            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            while (!queue.isEmpty()) {
                Node<String> n = queue.dequeue();

                if (n.left != null) {
                    queue.enqueue(n.left);
                }

                if (n.right != null) {
                    queue.enqueue(n.right);
                }

                if (n.left == null && n.right == null) {
                    n.left = new Node<String>("down", null, null);
                    n.right = new Node<String>("up", null, null);
                }
            }
        }

        return root;
    }

    public static void printTree(Node<String> root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            printTree(root.left);
        }
        System.out.print(root.item + " ");
        if (root.right != null) {
            printTree(root.right);
        }
    }

    private static class Node<T> {
        public T item;
        public Node<T> left;
        public Node<T> right;

        public Node(T item, Node<T> left, Node<T> right) {
            this.item = item;
            this.right = right;
            this.left = left;
        }
    }
}
