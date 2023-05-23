package com.cetc.TreeSetTest;

import java.util.*;

public class StudentsTestDemo003 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2) ->
                //代码的进化史

                //最初的代码，自己写的
                /*if(o1.length() > o2.length()){
                    return 1;
                } else if (o1.length() < o2.length()){
                    return -1;
                }
                return o1.compareTo(o2);*/

                //后来看了第一句改进的
                /*int i = o1.length() - o2.length();
                if(i == 0){
                    return o1.compareTo(o2);
                }
                return i;*/

                //最后改进的代码，用三目运算符改写，更加简洁

                o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length());

//        TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt( String ::length).thenComparing(o -> o));


        String s1 = "qwer";
        String s2 = "df";
        String s3 = "as";
        String s4 = "zxc";
        String s5 = "g";
        String s6 = "abc";

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        ts.forEach(System.out::println);
        System.out.println(ts);

    }
}
