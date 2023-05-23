package com.cetc.SetTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo002 {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();

        s.add("ccc");
        s.add("bbb");
        s.add("ff");
        s.add("cc");
        s.add("eee");
        s.add("aaa");
        s.add("d");

        //存取顺序一致，但是数据没有排序
        System.out.println(s);//[ccc, bbb, ff, cc, eee, aaa, d]
    }
}
