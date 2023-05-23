package com.cetc.TreeSetTest;

import java.util.TreeSet;

public class TreeSetDemo002 {
    public static void main(String[] args) {
        Students s1 = new Students("ZhangSan",23);
        Students s2 = new Students("LiSi",24);
        Students s3 = new Students("WangWu",25);
        Students s4 = new Students("ZhaoLiu",26);
        Students s5 = new Students("ZhangSan",23);
        Students s6 = new Students("QianFeng",23);

        TreeSet<Students> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        System.out.println(ts);
    }
}
