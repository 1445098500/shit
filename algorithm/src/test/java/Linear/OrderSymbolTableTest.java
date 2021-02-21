package Linear;

import symbol.OrderSymbolTable;

public class OrderSymbolTableTest {
    public static void main(String[] args) {
        OrderSymbolTable<Integer, String> ta = new OrderSymbolTable<>();
        ta.put(5, "四");
        ta.put(4, "三");
        ta.put(2, "贰");
        ta.put(1, "一");
        ta.put(3, "adasd");
        for (int i = 1; i < 6; i++) {
            System.out.println(ta.get(i));
        }
    }
}
