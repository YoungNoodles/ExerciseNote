package com.cetc.a03FastSortTest;

import java.util.Scanner;

public class RecursiveAlgorithm004 {
    private static int left = 1;
    public static void main(String[] args) {
        //猴子吃桃子，每次吃剩余的一半再多吃一个
        //第十天的时候（还没吃），发现还剩一个桃子，问一开始有多少个桃子
        getCount(9);
        System.out.println(left);

        int peach = 1;
        Scanner sc = new Scanner(System.in);
        //弄个循环做，就不递归，循环多简单
        int day = sc.nextInt();
        for (int i = 1; i < day; i++) {
            peach = (peach + 1) * 2;
        }

        System.out.println(peach);
    }

    public static void getCount(int days){//这里的days是一共吃了几天
        if(days >= 1){
            left = (left + 1) * 2;
            getCount(days - 1);
        }
    }
}
