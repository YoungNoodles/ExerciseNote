package com.cetc.ArraysTest;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class ArrTest001 {

    private static final int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = i * 10;
        }
    }

    public static void main(String[] args) {

        //String toString(arr)//将数组中的元素串进字符串
        System.out.println(Arrays.toString(arr));//[0, 10, 20, 30, 40, 0, 0, 0, 0, 0]

        //int binarySearch(数组, 要查找的元素)//二分查找
        System.out.println(Arrays.binarySearch(arr, 100));//-11，存在返回索引，不存在返回【-插入点-1】
        System.out.println(Arrays.binarySearch(arr, 33));//-5，存在返回索引，不存在返回【-插入点-1】
        System.out.println(Arrays.binarySearch(arr, 20));//2，存在返回索引，不存在返回【-插入点-1】
        System.out.println(Arrays.binarySearch(arr, -10));//-1，存在返回索引，不存在返回【-插入点-1】

        //int[] copyOf(原数组, 新数组长度)//拷贝数组--调用【System.arraycopy()】
        //新数组比旧数组短，在旧数组从0索引开始取新数组长度位
        //新数组比旧数组长，在旧数组的基础上，用默认值补齐元素
        int[] brr = Arrays.copyOf(arr, arr.length - 1);//从零索引开始克隆length位数据
        System.out.println(Arrays.toString(brr));//[0, 10, 20, 30, 40, 0, 0, 0, 0]

        //int[] copyOfRange(原数组, 起始索引, 结束索引)//指定范围的拷贝数组--包头不包尾
        int[] crr = Arrays.copyOfRange(arr, 1, arr.length - 3);//从from索引开始，克隆到to索引结束
        System.out.println(Arrays.toString(crr));//[10, 20, 30, 40, 0, 0]

        //void sort(数组)//按默认顺序排序数组，升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 10, 20, 30, 40]

        //void sort(数组, fromIndex, toIndex)//给指定范围的数据排序--包头不包尾
        Arrays.sort(brr, 2, brr.length - 3);//从fromIndex索引开始，到toIndex索引结束，将中间的数据进行默认顺序排序
        System.out.println(Arrays.toString(brr));//[0, 10, 0, 20, 30, 40, 0, 0, 0]

        //void sort(数组, 排序规则)//添加规则，是Comparator<引用数据类型>接口的实现类
        //底层是通过插值排序和二分查找进行排序
        //开始只将0索引认为是有序的，在有序索引后取第一个元素【就是参数中的o1】
        //用二分查找在有序区间内查找元素，与有序区间的元素进行比较【就是参数中的o2】，然后插值
        Integer[] drr = {0, 10, 20, 30, 40, 0, 0, 0, 0, 0};
        /*Arrays.sort(drr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//o1是后面无序的数据，o2是前面有序的二分时的数据
                return o2 - o1;//当返回负数时，插入前面||返回正数时，插入后面||返回0时，插入后面
                //o1 - o2时，是升序排列||o2 - o1时，是降序排列
            }
        });*/


        /*//使用lambda表达式改写上方匿名内部类的使用，简化
        Arrays.sort(drr, (o1, o2) -> {//o1是后面无序的数据，o2是前面有序的二分时的数据
            return o2 - o1;//当返回负数时，插入前面||返回正数时，插入后面||返回0时，插入后面
            //o1 - o2时，是升序排列||o2 - o1时，是降序排列
        });*/


        //lambda表达式的简写规则
        //参数可以省略类型
        //只有一个参数时，参数的小括号可以省略
        //方法体只有一行时，大括号、分号、return一同省略
        //Arrays.sort(drr, (o1, o2) -> o1 - o2);
        
        Arrays.sort(drr, (o1, o2) -> //o1是后面无序的数据，o2是前面有序的二分时的数据
                        o2 - o1//当返回负数时，插入前面||返回正数时，插入后面||返回0时，插入后面
                //o1 - o2时，是升序排列||o2 - o1时，是降序排列
        );

        System.out.println(Arrays.toString(drr));//[0, 0, 0, 0, 0, 0, 10, 20, 30, 40]
        System.out.println("为什么");
        //void fill(数组)//填充数组--将数组中所有的元素都改成输入的参数
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
