package Rank.tools;

import Rank.advanced.Merge;
import Rank.advanced.Quick;
import Rank.advanced.Shell;
import Rank.simple.Insertion;

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
        /*
        十万
        运行时间为：54毫秒。
        运行时间为：131毫秒。
        溢出

        万
        运行时间为：33毫秒。
        运行时间为：10毫秒。
        运行时间为：184毫秒。

        千
        运行时间为：5毫秒。
        运行时间为：3毫秒。
        运行时间为：24毫秒。
         */
        testShell(a);
        //testInsertion(a);
        testMerge(a);
        testQuick(a);
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

    public static void testMerge(Integer[] a){
        long start = System.currentTimeMillis();

        Merge.sort(a);

        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-start)+"毫秒。");
    }

    public static void testQuick(Integer[] a){
        long start = System.currentTimeMillis();

        Quick.sort(a);

        long end = System.currentTimeMillis();
        System.out.println("运行时间为："+(end-start)+"毫秒。");
    }

}
