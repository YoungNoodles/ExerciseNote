package com.cetc.MapTest;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest001 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();

        System.out.println(m.isEmpty());
        System.out.println("---------------------------------");

        //添加产品，假如是手机
        System.out.println("添加元素的测试");
        System.out.println(m.put("HuaWei", 5999));//null
        System.out.println(m.put("XiaoMi", 2999));//null
        System.out.println(m.put("OPPO", 4999));//null
        System.out.println(m.put("vivo", 4999));//null
        System.out.println(m.put("iPhone", 11999));//null
        System.out.println(m.put("XiaoMi", 3999));//2999
        System.out.println("---------------------------------");

        System.out.println("空");
        System.out.println(m.isEmpty());
        System.out.println(m);
        System.out.println("---------------------------------");
        //遍历，试一下迭代器
        System.out.println("迭代器遍历，分开遍历");
        Iterator<String> it = m.keySet().iterator();//选哪个就是哪个的迭代器，遍历哪一个
        //keySet()是一个存储键的Set集合
        Iterator<Integer> ii = m.values().iterator();

        while (it.hasNext()){//这是键的迭代器遍历
            System.out.println(it.next());
        }
        System.out.println("---------------------------------");
        while (ii.hasNext()){//这是值的迭代器遍历
            System.out.println(ii.next());
        }
        System.out.println("---------------------------------");

        //试试增强for遍历
        System.out.println("增强for遍历");
        for (String k : m.keySet()) {//与迭代器一样，键和值只能分开遍历
            System.out.println(k);
        }
        System.out.println("---------------------------------");

        for (Integer v : m.values()) {//这个是值的遍历
            System.out.println(v);
        }
        System.out.println("---------------------------------");

        //试一试forEach方法遍历
        m.forEach((key, value) -> System.out.println(key +" "+ value));
        //得出结论，HashMap和HashSet一样是无序的，存取顺序不一致
        //三种遍历方法依然可以使用的，但是键值要分别遍历，只有forEach可以一次遍历两个
        System.out.println("---------------------------------");
        System.out.println("分开遍历，先获取keySet，再遍历keySet使用get方法遍历value");
        //再试一种遍历
        Set<String> s = m.keySet();
        //装着键的集合用增强for遍历值
        for (String k : s) {
            System.out.println(k + "：" + m.get(k));
        }
        //装着键的集合用迭代器遍历值
        Iterator<String> ite = s.iterator();
        while (ite.hasNext()){
            String key = ite.next();
            System.out.println(key + "=" + m.get(key));
        }
        //装着键的集合用lambda表达式遍历值
        s.forEach(k -> System.out.println(k + "--" +m.get(k)));
        System.out.println("---------------------------------");
        //通过键值对遍历，Entry
        Iterator<Map.Entry<String,Integer>> im = m.entrySet().iterator();
        System.out.println("看看这个打印出来是什么");
        while (im.hasNext()){
            System.out.println(im.next());
        }

        m.entrySet().forEach((e) -> System.out.println(e.getKey() + " `` " + e.getValue()));

        System.out.println("---------------------------------");

        System.out.println(m.containsKey("HuaWei"));//true
        System.out.println(m.containsKey("Microsoft"));//false

        System.out.println(m.containsValue(10086));//false
        System.out.println(m.containsValue(3999));//true

        System.out.println(m.size());//5
        System.out.println(m.remove("HTC"));//null
        System.out.println(m.remove("iPhone"));//11999
        System.out.println(m.size());//4
        System.out.println(m.remove("XiaoMi", 3999));//true
        System.out.println(m.remove("XiaoMi", 3999));//false
        System.out.println(m.remove("OPPO", 1999));//false
        System.out.println(m.size());//3

        m.clear();
        System.out.println("---------------------------------");


    }
}
