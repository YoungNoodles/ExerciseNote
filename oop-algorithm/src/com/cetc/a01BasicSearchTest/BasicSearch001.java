package com.cetc.a01BasicSearchTest;

import java.util.Scanner;

public class BasicSearch001 {
    public static void main(String[] args) {
        //基本查找
        //遍历数组，从中寻找是否有符合条件的元素
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        Scanner sc = new Scanner(System.in);
        //输入要查询的元素
        int num = sc.nextInt();
        //调用方法，打印是否存在
        System.out.println(basicSearch(arr, num));
    }

    public static boolean basicSearch(int[] arr, int num) {
        //查谁？要查找的元素 int num
        //从哪里查？集合 int[] arr
        //结果是什么？返回查找是否存在 boolean
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
