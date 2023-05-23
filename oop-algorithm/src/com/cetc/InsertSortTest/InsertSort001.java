package com.cetc.InsertSortTest;

import java.util.Arrays;
import java.util.Random;

public class InsertSort001 {
    public static void main(String[] args) {
        //int[] arr = {5, 165, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        //插入排序
        Random ra = new Random();
        int[] arr = new int[1000000];
        long head = System.currentTimeMillis();
        insertSort(arr);
        long foot = System.currentTimeMillis();
        System.out.println(foot - head);
        //看看最终结果
//        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //内部循环到大于当前定位元素的第一个元素
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[i]){
                    //记录第一个大于当前元素的元素的索引
                    int temp = arr[i];
                    //继续剩下的循环，向后移位
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    //全部后移之后，将当前定位元素插入到应该在的位置
                    arr[j] = temp;
                }
            }
        }
    }
}
