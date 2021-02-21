package Linear;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (Integer i :
                stack) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        System.out.println(stack.pop());

        System.out.println("--------------------------");

        for (Integer i :
                stack) {
            System.out.println(i);
        }


    }


}
