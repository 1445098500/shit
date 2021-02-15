import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(SortCompare.class.getResourceAsStream("reverse_arr.txt")));
        String line =null;
        while ((line=reader.readLine())!=null){
            int i = Integer.parseInt(line);
            list.add(i);
        }

        reader.close();

        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        //testShell(a);
        testInsertion(a);
    }

    public static void testShell(Integer[] a){
        long start = System.currentTimeMillis();

        Shell.sort(a);

        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-start)+"毫秒。");
    }

    public static void testInsertion(Integer[] a){
        long start = System.currentTimeMillis();

        Insertion.sort(a);

        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-start)+"毫秒。");
    }
}
