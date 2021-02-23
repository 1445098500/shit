package heap;

public class HeapTest {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>(10);

        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);

        Integer result;
        while ((result = heap.delMax()) != null) {
            System.out.print(result + " ");
        }
    }
}
