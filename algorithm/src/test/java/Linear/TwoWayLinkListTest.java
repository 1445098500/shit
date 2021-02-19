package Linear;

public class TwoWayLinkListTest {
    public static void main(String[] args) {

        TwoWayLinkList<String> st = new TwoWayLinkList<>();
        st.insert("a");
        st.insert("b");
        st.insert("c");
        st.insert("d");
        st.insert("e");
        st.insert(4, "1");
        for (String s :
                st) {
            System.out.println(s);
        }

        /*st.remove(1);
        System.out.println(st.get(3));
        System.out.println("-------------------------------------");
        for (String s :
                st) {
            System.out.println(s);
        }
        System.out.println(st.length());
        System.out.println("-------------------------------------");
        System.out.println(st.indexOf("b"));

         */
    }
}
