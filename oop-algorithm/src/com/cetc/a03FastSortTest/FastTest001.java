package com.cetc.a03FastSortTest;

import java.util.Arrays;
import java.util.Random;

public class FastTest001 {
    public static void main(String[] args) {
        //int[] arr = {5, 165, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        //定义变量记录起始索引和结尾索引
        Random ra = new Random();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt();
        }
        int i = 0;
        int j = arr.length - 1;

        long head = System.currentTimeMillis();
        fastSort(arr, i, j);
        long foot = System.currentTimeMillis();
        System.out.println(foot - head);
//        System.out.println(Arrays.toString(arr));
    }

    public static void fastSort(int[] arr, int i, int j) {

        if (i >= j) {
            //递归出口
            //当起始指针大于结束指针，是错误状态，此时返回方法
            return;
        }
        //定义起始指针和结束指针
        int start = i;
        int end = j;
        //定义基准数字
        int baseNumber = arr[i];

        while (start < end) {
            //先看end，找到小于基数的值或与start相遇
            while (true) {
                if (end == start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //再看start，找到大于基数的值或与end相遇
            while (true) {
                if (start == end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            //交换start和end指向的值
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        //若起止指针相遇了，进行基数归位
        arr[i] = arr[start];
        arr[start] = baseNumber;

//这里是不能更改输入i、j的值的
        //改了值第二个右侧范围会出错误
        //确定左边的范围
        //当前左侧的范围，i不变，j比基准位置减一
        fastSort(arr, i, end - 1);
        //确定右边的范围
        //当前右侧的范围，i比基准位置加一，j不变
        fastSort(arr, start + 1, j);

    }

}
