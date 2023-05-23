package com.cetc.LinkedHashMapTest;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo001 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("aaa",111);
        lhm.put("bbb",222);
        lhm.put("ccc",333);
        lhm.put("ddd",444);
        lhm.put("eee",555);
        lhm.put("fff",666);
        lhm.put("aaa",777);

        System.out.println(lhm);
    }
}
