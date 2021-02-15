import java.io.*;

public class fileCreator {
    public static void main(String[] args) throws IOException{
        BufferedWriter out = new
                BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/resources/reverse_arr.txt")));
        for (int i=100000;i>0;i--){
            out.write(i+"\n");
        }
        out.close();
        System.out.println
                ("文件创建成功！");

    }
}
