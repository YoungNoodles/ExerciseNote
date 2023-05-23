package com.cetc.ArraysTest;

import java.util.Arrays;

public class ArrTest002 {
    public static void main(String[] args) {
        //给一个数组存入一些字符串
        //给数组内的内容按照字符串的长度进行排序
        //例：
        String[] arr = {"aa", "a", "aaaa", "aaa"};
        //排序完成后得到["a","aa","aaa","aaaa"]

        //得到该排序，就是默认顺序，不用重写条件
        Arrays.sort(arr);//默认排序，是升序的
        System.out.println(Arrays.toString(arr));//["a","aa","aaa","aaaa"]

        Arrays.sort(arr,(o1, o2)-> o2.length() - o1.length());//使用lambda表达式简写排序算法
        //2 - 1是降序，1 - 2是升序
        System.out.println(Arrays.toString(arr));//[aaaa, aaa, aa, a]
    }
}
