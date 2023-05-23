package com.cetc.TreeSetTest;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo001 {
    public static void main(String[] args) {
        //创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<>();
        //添加元素
        ts.add(1);
        ts.add(4);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(6);

        System.out.println(ts);//[1, 2, 3, 4, 5, 6]

        //遍历方式
        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }//1 2 3 4 5 6

        //增强for遍历
        for (Integer t : ts) {
            System.out.println(t);
        }//1 2 3 4 5 6

        //匿名内部类遍历
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });//1 2 3 4 5 6

        //lambda表达式遍历
        ts.forEach(t -> System.out.println(t));//1 2 3 4 5 6
        ts.forEach(System.out::println);//1 2 3 4 5 6
    }
}
