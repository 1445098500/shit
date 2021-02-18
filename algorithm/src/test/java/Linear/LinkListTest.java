package Linear;

public class LinkListTest {

    public static void main(String[] args) {
        LinkList<String> st = new LinkList<String>();

        st.insert("a");
        st.insert("b");
        st.insert(1, "1");
        for (String s :
                st) {
            System.out.println(s);
        }
        System.out.println(st.length());
        st.remove(1);
        System.out.println(st.get(3));
        System.out.println("-------------------------------------");
        for (String s :
                st) {
            System.out.println(s);
        }
        System.out.println(st.length());
        System.out.println("-------------------------------------");
        System.out.println(st.indexOf("b"));

    }


}
