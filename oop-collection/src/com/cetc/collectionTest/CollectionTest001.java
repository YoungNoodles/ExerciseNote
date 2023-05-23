package com.cetc.collectionTest;

import java.util.*;

public class CollectionTest001 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);
        //迭代器遍历
        //创建迭代器对象，要从需要遍历的集合中创造，初始默认指向0索引
        //不需要手动添加索引，自动移动

        Iterator<String> it = list.iterator();
        while (it.hasNext()){//迭代器的判断方法，判断当前位置是否有元素
            if(it.next().equals("bbb")){//用迭代器删除集合中的元素，调用迭代器的remove方法
                it.remove();
            }
        }//移动结束后不会自动复位，即遍历结束后要再结束，需要重新获取迭代器

        //迭代器的判断方法，判断当前位置是否有元素
        //用迭代器删除集合中的元素，调用迭代器的remove方法
        //移动结束后不会自动复位，即遍历结束后要再结束，需要重新获取迭代器
        list.removeIf(s -> s.equals("bbb"));
        System.out.println(list);

        //增强for遍历
        for (String str : list) {
            System.out.println(str);
        }

        //利用lambda表达式遍历
        //调用集合中的forEach()方法
        list.forEach(s -> System.out.println(s));
    }
}
