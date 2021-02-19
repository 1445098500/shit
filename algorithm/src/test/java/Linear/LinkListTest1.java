package Linear;


public class LinkListTest1 {

    public static void main(String[] args) {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> sixth = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;


        seven.next = fifth;

        System.out.println();

        System.out.println(isCircle(first));
        System.out.println(getEntrance(first).item);

    }

    public static boolean isCircle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static Node getEntrance(Node head) {
        Node fast = head;
        Node slow = head;
        Node temp = null;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow && count == 0) {
                temp = head;
                count = 1;
                continue;
            }

            if (temp != null) {
                temp = temp.next;
                if (temp == slow) {
                    break;
                }
            }

        }
        return temp;
    }

    private static class Node<T> {
        T item;
        Node<String> next;

        public Node(T item, Node<String> next) {
            this.item = item;
            this.next = next;
        }
    }
}
