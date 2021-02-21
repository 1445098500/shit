package Linear;

public class ReversePolishNotationTest {
    public static void main(String[] args) {
        System.out.println(calculate("3,17,15,-,*,18,6,/,+"));
    }

    public static int calculate(String notation) {
        String[] arr = notation.split(",");
        Stack<Integer> operands = new Stack<>();
        for (String curr : arr) {
            Integer pop1;
            Integer pop2;
            Integer result;
            switch (curr) {
                case "+" -> {
                    pop1 = operands.pop();
                    pop2 = operands.pop();
                    result = pop2 + pop1;
                    operands.push(result);
                }
                case "-" -> {
                    pop1 = operands.pop();
                    pop2 = operands.pop();
                    result = pop2 - pop1;
                    operands.push(result);
                }
                case "*" -> {
                    pop1 = operands.pop();
                    pop2 = operands.pop();
                    result = pop2 * pop1;
                    operands.push(result);
                }
                case "/" -> {
                    pop1 = operands.pop();
                    pop2 = operands.pop();
                    result = pop2 / pop1;
                    operands.push(result);
                }
                default -> operands.push(Integer.parseInt(curr));
            }
        }

        return operands.pop();
    }
}
