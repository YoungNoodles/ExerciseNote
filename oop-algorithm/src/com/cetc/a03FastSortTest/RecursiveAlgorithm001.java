package com.cetc.a03FastSortTest;

import java.util.Scanner;

public class RecursiveAlgorithm001 {
    //这是递归算法
    //递归算法要注意，寻找出口，什么时候要退出递归
    //找规律，什么时候用递归，怎么将任务细化使用递归
    public static void main(String[] args) {
        //递归就是自己调用自己
        //计算1~100的和
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }

    public static int sum(int num) {
        //加到1，若本来就是1，则直接返回1
        if(num == 1){
            return 1;
        }

        //若不是1，就调用一个减一的自己，直到减到1为止
        return num + sum(num - 1);
    }
}
