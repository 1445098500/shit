package priority;

public class MinPriorityQueueTest {
    public static void main(String[] args) {
        MinPriorityQueue<String> queue = new MinPriorityQueue<String>(10);
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");
        while (!queue.isEmpty()) {
            String min = queue.delMin();
            System.out.print(min + " ");
        }
    }
}
