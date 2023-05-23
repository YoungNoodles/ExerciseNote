package com.cetc.a03FastSortTest;

import java.util.Scanner;

public class RecursiveAlgorithm002 {
    public static void main(String[] args) {
        //递归的小练习
        //计算阶乘
        //最多正确计算31的阶乘，32会得到int的下限值
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        //如果是0或者1，阶乘是1
        if(n == 0 || n == 1){
            return 1;
        }
        //若不是1，逐级减一递归
        //参数必须更加接近出口
        return n * factorial(n - 1);
    }
}
