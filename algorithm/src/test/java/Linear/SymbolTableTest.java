package Linear;

import symbol.SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> ta = new SymbolTable<>();

        ta.put(1, "一");
        ta.put(2, "贰");
        ta.put(3, "三");
        ta.put(4, "四");
        for (int i = 1; i < 5; i++) {
            System.out.println(ta.get(i));
        }
        System.out.println("------------------------------");
        ta.put(2, "二");
        for (int i = 1; i < 5; i++) {
            System.out.println(ta.get(i));
        }
        System.out.println("------------------------------");
        ta.delete(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(ta.get(i));
        }

    }
}
