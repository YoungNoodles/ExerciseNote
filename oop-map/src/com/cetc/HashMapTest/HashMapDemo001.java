package com.cetc.HashMapTest;

import java.util.HashMap;

public class HashMapDemo001 {
    private static HashMap<Students,String> hm = new HashMap<>();

    static {
        Students s1 = new Students("zhangsan",23);
        Students s2 = new Students("lisi",24);
        Students s3 = new Students("wangwu",25);

        hm.put(s1,"bei jing");
        hm.put(s2,"shang hai");
        hm.put(s3,"shen zhen");
    }
    public static void main(String[] args) {
        hm.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
