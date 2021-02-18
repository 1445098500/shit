package Linear;

public class SequenceLiseTest {
    public static void main(String[] args) {


        SequenceList<String> s = new SequenceList<>(2);
 /*
        s.insert("a");
        s.insert("c");
        s.insert("d");
*/


        s.insert("a");
        s.insert("c");
        s.insert("d");
        System.out.println(s.length());
        s.insert(1, "b");
        System.out.println(s.length());
        s.remove(1);
        System.out.println(s.length());
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("r"));
        System.out.println(s.isEmpty());
        //s.clear();
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println("----------------------------------------------");
        System.out.println(s.iterator().hasNext());
        for (String s1 : s
        ) {
            System.out.println(s1);


        }
    }
}
