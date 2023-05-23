package com.cetc.a03FastSortTest;

public class RecursiveAlgorithm003 {

    private static int count = 2;

    public static void main(String[] args) {
        //假如有一对兔子，出生后三个月起，每个月都生一对兔子
        //假如兔子都不会死，那等到十二个月的时候一共有多少只兔子
        //定义一个整型变量记录月份
        int month = 1;
        getCount(month);
        System.out.println(count);

        //创建一个长度为12的数组
        int[] arr = new int[12];
        arr[0] = arr[1] = 1;
        //生成斐波那契数列
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        //打印一下结果
        System.out.println(arr[11]);

        //看一下count()方法的结果
        System.out.println(count(12));
    }

    public static void getCount(int month) {
        //先定义出口，当月份等于13月的时候结束
        //也可以等月份等于12的时候结束，看想繁殖多久
        /*if(month >= 13){
            return;
        }*/

        //先定义一个变量记录出生的月份，即传入方法的参数
        int birth = month;
        //当出生少于两个月时，不生新兔子
        while (month < 13 && month - birth < 2) {
            //还没到能生的时候，什么都不做就加月份
            month++;
        }

        //出生达到第三个月，开始生新的兔子
        while (month < 13 && month - birth >= 2) {
            //给计数器加2
            count += 2;
            //有一对新兔子之后，要再计算新的一对兔子的生育
            getCount(month);
            //给月份加一
            month++;
        }

    }

    public static int count(int month){
        //输入要计算的月份，若是1、2，则返回1
        if(month == 1||month == 2){
            return 1;
        }else{//若比2大，则开始生新兔子
            return count(month - 1) + count(month - 2);
        }

    }
}
