package Linear;

public class LinkListTest {

    public static void main(String[] args) {
        LinkList<String> st = new LinkList<String>();

        st.insert("1");
        st.insert("2");
        st.insert("3");
        st.insert("4");
        st.insert("5");
        st.insert("6");
        st.insert("7");
        for (String s :
                st) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        System.out.println(st.isCircle());


    }


}
