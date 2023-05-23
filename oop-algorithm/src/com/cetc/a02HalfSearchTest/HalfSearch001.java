package com.cetc.a02HalfSearchTest;

import java.util.Scanner;

public class HalfSearch001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5, 13, 18, 49, 51, 51, 52, 57, 61, 73, 76, 101, 108, 119, 127, 141, 147, 153, 155, 156, 158, 165, 167, 170, 175, 177, 193, 194, 194, 197};
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //7 3 1 5 4
        //输入要查找的数字
//        for (int i = 0; i < arr.length; i++) {
//            int target = sc.nextInt();
        System.out.println(halfSearch(arr, 6));
//        }
    }

    public static boolean halfSearch(int[] arr, int target) {
        //定义两个变量记录所在区域的起始和结束索引
        int start = 0;
        int end = arr.length - 1;
        /*//先判断开头和结尾索引是否符合条件
        if(arr[start] == target || arr[end] == target){
            return true;
        }*/
        //设置循环，当区间起始索引start小于结束索引end的时候，才进行查找
        //当索引相遇没有找到，则跳出循环，返回false
        while (end >= start) {
            //定义一个变量，记录要比较的中间值
            int mid = (end + start) / 2;
            //判断目标与中间值的大小，重新设置起止位置
            if (target < arr[mid]){
                end = (end + start) / 2 - 1;
            } else if (target > arr[mid]) {
                start = (end + start) / 2 + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
