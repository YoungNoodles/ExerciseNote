package com.cetc.LinkedHashMapTest;

import java.util.Comparator;
import java.util.TreeMap;

public class LinkedHashMapDemo002 {
    public static void main(String[] args) {
        //创建TreeMap对象，传递比较器对象重写比较方法
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });//升序排列，小前大后，默认升序

        TreeMap<Integer,String> tm2 = new TreeMap<>((o1, o2) -> o2 - o1);//降序排列，大前小后

        tm.put(1,"小米");
        tm.put(2,"华为");
        tm.put(3,"oppo");
        tm.put(4,"vivo");
        tm.put(5,"iPhone");
        tm.put(6,"onePlus");
        tm.put(7,"中兴");
        tm.put(8,"魅族");

        System.out.println(tm);
        System.out.println("-----------------------------------");
        tm2.put(1,"小米");
        tm2.put(2,"华为");
        tm2.put(3,"oppo");
        tm2.put(4,"vivo");
        tm2.put(5,"iPhone");
        tm2.put(6,"onePlus");
        tm2.put(7,"中兴");
        tm2.put(8,"魅族");

        System.out.println(tm2);
    }
}
