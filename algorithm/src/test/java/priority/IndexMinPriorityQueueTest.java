package priority;

public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<>(10);

        queue.insert(0, "A");
        queue.insert(1, "C");
        queue.insert(2, "F");
        queue.delete(1);
        queue.changeItem(1, "B");

        while (!queue.isEmpty()) {
            int i = queue.delMin();
            System.out.print(i + " ");
        }
    }
}
