package Rank.simple;

import Rank.simple.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {9, 5, 7, 8, 6, 1, 4, 3, 2};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

