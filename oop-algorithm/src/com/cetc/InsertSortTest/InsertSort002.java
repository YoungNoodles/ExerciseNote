package com.cetc.InsertSortTest;

import java.util.Arrays;
import java.util.Random;

public class InsertSort002 {
    public static void main(String[] args) {
        //int[] arr = {5, 165, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        //这个排序方法其实是类似于插入排序
        //但是它运行的次数是和选择排序是一样的
        Random ra = new Random();
        int[] arr = new int[1000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt();
        }

        long head = System.currentTimeMillis();
        unknownSort(arr);
        long foot = System.currentTimeMillis();
        System.out.println(foot - head);
        //看看结果
//        System.out.println(Arrays.toString(arr));
    }

    private static void unknownSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
