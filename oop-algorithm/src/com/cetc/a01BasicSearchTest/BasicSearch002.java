package com.cetc.a01BasicSearchTest;

import java.util.ArrayList;
import java.util.Objects;

public class BasicSearch002 {
    //1.查找元素是否存在，若存在，则返回索引，不考虑重复

    //2.查找元素是否存在，若存在，则返回索引，考虑重复元素
    public static void main(String[] args) {
        int[] arr = {5, 13, 18, 49, 51, 51, 52, 57, 61, 73, 76, 101, 108, 119, 127, 141, 147, 153, 155, 156, 158, 165, 167, 170, 175, 177, 193, 194, 194, 197};
        //不考虑重复元素的
        System.out.println(searchFirstIndex(arr,51));

        //考虑重复元素的
        System.out.println(searchAllIndex(arr,194));
    }

    public static int searchFirstIndex(int[] arr, int num){
        //查什么？某个元素的索引 int num
        //从哪查？某数组 int[] arr
        //返回什么？第一个存在元素的索引 default -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> searchAllIndex(int[] arr, int num){
        ArrayList<Integer> intList = new ArrayList<>();
        //遍历查找，因为不知道是否存在要查找的元素，故创建集合准备存储要返回的索引
        //循环查找元素，找到元素将索引添加到集合
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                intList.add(i);
            }
        }
        //判断一下集合中是否存储了元素，若是空集合，则添加-1表示没有符合条件的元素
        //若不是空集合，则直接返回集合
        if(intList.size() == 0){
            intList.add(-1);
            return intList;
        }
        return intList;
    }
}
