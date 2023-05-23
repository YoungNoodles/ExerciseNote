package com.cetc.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo001 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        System.out.println(s.isEmpty());//空集合，true

        //添加元素
        System.out.println(s.add("aaa"));//不存在，添加成功，返回true
        System.out.println(s.add("bbb"));//不存在，添加成功，返回true
        System.out.println(s.add("ccc"));//不存在，添加成功，返回true
        System.out.println(s.add("ddd"));//不存在，添加成功，返回true
        System.out.println(s.add("eee"));//不存在，添加成功，返回true
        System.out.println(s.add("fff"));//不存在，添加成功，返回true
        System.out.println(s.add("fff"));//存在，添加失败，返回false

        System.out.println(s.isEmpty());//非空集合，false
        System.out.println(s.size() + " " + s);//6 [aaa, ccc, bbb, eee, ddd, fff]

        System.out.println(s.contains("ggg"));//不存在ggg
        System.out.println(s.contains("aaa"));//存在aaa

        System.out.println(s.remove("hhh"));//删除hhh，不存在，删除失败，true
        System.out.println(s.remove("aaa"));//删除aaa，存在，删除成功，false
        System.out.println(s.size() + " " + s);//5 [ccc, bbb, eee, ddd, fff]

        //迭代器遍历HashSet集合
        /*Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }//ccc bbb eee ddd fff*/

        /*//增强for遍历HashSet集合
        for (String str : s) {
            System.out.println(str);
        }//ccc bbb eee ddd fff*/

        //lambda表达式遍历HashSet集合
        //s.forEach(str -> System.out.println(str));//ccc bbb eee ddd fff
        //s.forEach(System.out::println);//ccc bbb eee ddd fff

        s.clear();//清空集合

        System.out.println(s.size() + " " + s);//0 []

    }
}
