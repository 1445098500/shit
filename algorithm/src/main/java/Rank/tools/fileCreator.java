package Rank.tools;

import java.io.*;

public class fileCreator {
    public static void main(String[] args) throws IOException{
        BufferedWriter out = new
                BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/resources/reverse_arr(qian).txt")));
        for (int i=1000;i>0;i--){
            out.write(i+"\n");
        }
        out.close();
        System.out.println
                ("文件创建成功！");

    }
}
