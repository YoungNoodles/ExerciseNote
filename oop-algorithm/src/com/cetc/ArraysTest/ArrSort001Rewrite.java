package com.cetc.ArraysTest;

import java.util.Arrays;

public class ArrSort001Rewrite {

    private static final Dogs[] arr = new Dogs[6];

    static {
        arr[0] = new Dogs("tusi", 2, 30);
        arr[1] = new Dogs("doujiang", 4, 23);
        arr[2] = new Dogs("tangyuan", 3, 110);
        arr[3] = new Dogs("kele", 2, 33);
        arr[4] = new Dogs("huoguo", 4, 50);
        arr[5] = new Dogs("tuolaji", 3, 110);
    }

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        Arrays.sort(arr, (o1, o2) -> {

            //定义变量temp，接收年龄差
            double temp = o1.getAge() - o2.getAge();

            //若年龄一样大，获得体重差，若年龄不一样大，保留年龄的大小差
            temp = temp == 0 ? o1.getWeight() - o2.getWeight() : temp;

            //若体重一样大，比较姓名中的字母，若体重不一样大，保留体重的大小差
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            //做一下判断准备返回值
            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            }

            return 0;
        });

        long b = System.currentTimeMillis();
        System.out.println(b - a);
        //打印一下结果看看
        for (Dogs dogs : arr) {
            System.out.println(dogs.toString());
        }
    }
}
