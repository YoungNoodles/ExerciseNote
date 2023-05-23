package com.cetc.SelectSortTest;

import java.util.Arrays;
import java.util.Random;

public class SelectSort001 {
    public static void main(String[] args) {
        //选择排序
        //把当前每一个元素和后面的元素依次比较，符合条件交换位置
//        int[] arr = {5, 165, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        Random ra = new Random();
        int[] arr = new int[1000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt();
        }

        long head = System.currentTimeMillis();
        selectSort(arr);
        long foot = System.currentTimeMillis();
        System.out.println(foot - head);
        //看看结果
//        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
