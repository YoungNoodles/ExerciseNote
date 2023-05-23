package com.cetc.a01BasicSearchTest;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //生成一个随机的集合用于测试查找算法
        Random ra = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt(200) + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
