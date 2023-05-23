package com.cetc.BubbleSortTest;

import java.util.Arrays;

public class BubbleSort001 {
    public static void main(String[] args) {
        int[] arr = {165, 5, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        //冒泡排序
        // 以升序为例，比较相邻的两个元素大小，大元素放右边
        //定义一个计数器计数，进行了多少次循环
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //每次循环后，剩余元素中最大的数字都跑到了正确位置，下次循环可以减少一次
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    count++;
                    System.out.println(Arrays.toString(arr) + "" + count);
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
