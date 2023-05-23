package com.cetc.LinkedHashMapTest;

import com.cetc.HashMapTest.Students;

import java.util.TreeMap;

public class LinkedHashMapDemo003 {
    public static void main(String[] args) {
        Students s1 = new Students("zhangsan", 23);
        Students s3 = new Students("wangwu", 25);
        Students s5 = new Students("zhangsan", 23);
        Students s4 = new Students("zhaoliu", 26);
        Students s2 = new Students("lisi", 24);

        TreeMap<Students, String> lhm = new TreeMap<>(/*(o1, o2) ->
                o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge()*/
        );

        lhm.put(s1, "宁夏");
        lhm.put(s2, "西藏");
        lhm.put(s3, "广西");
        lhm.put(s4, "新疆");
        lhm.put(s5, "内蒙古");

        lhm.forEach((student,place) -> System.out.println(student + "\t" + place));
    }
}
