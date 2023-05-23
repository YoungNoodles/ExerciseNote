package com.cetc.ListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest001 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        /*Integer in = 2;
        list.remove(in);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);*/

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
            if(i == 2){
                it.set(8);
            }
            if(i == 3){
                it.add(5);
            }
            if(i == 4){
                it.remove();
            }
            System.out.println(list);
        }

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
