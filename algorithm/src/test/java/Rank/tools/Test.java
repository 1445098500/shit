package Rank.tools;

import Rank.tools.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("jack");
        s1.setAge(11);

        Student s2 = new Student();
        s2.setName("rose");
        s2.setAge(20);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
