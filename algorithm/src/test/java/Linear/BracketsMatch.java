package Linear;

public class BracketsMatch {
    public static void main(String[] args) {
        String str = "(()())";
        System.out.println(isMatch(str));
    }

    public static boolean isMatch(String str) {
        Stack<String> list = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String curr = str.charAt(i) + "";
            if (curr.equals("(")) {
                list.push(curr);
            } else if (curr.equals(")")) {
                if (list.pop() == null) {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}
