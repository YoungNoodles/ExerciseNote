package com.cetc.collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest002 {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();

        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);

        ArrayList<ArrayList<String>> arrlist = new ArrayList<>();

        arrlist.add(new ArrayList<>());
        arrlist.add(new ArrayList<>());
        arrlist.add(new ArrayList<>());
        arrlist.get(0).add("aaa");
        arrlist.get(0).add("bbb");
        arrlist.get(1).add("ccc");
        arrlist.get(1).add("ddd");
        arrlist.get(1).add("eee");
        arrlist.get(2).add("fff");

        System.out.println(arrlist.get(0));
        System.out.println(arrlist.get(1));
        System.out.println(arrlist.get(2));

        System.out.println(arrlist);
    }
}
