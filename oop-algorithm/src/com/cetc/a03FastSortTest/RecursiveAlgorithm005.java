package com.cetc.a03FastSortTest;

public class RecursiveAlgorithm005 {
    public static void main(String[] args) {
        //小明喜欢爬楼梯，有时候一次爬一级，有时候一次爬两级
        //现在有20级台阶，问小明一共有多少种方法爬楼梯
        int all = 20;
        long count = 0L;
        //正向思维，从全一到全二，像树一样
        long a = System.currentTimeMillis();
        count = getCount(all, count);
        long b = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(b - a);
        //反向思维，20 = 19 + 18
        //19 = 18 + 17
        //18 = 17 + 16
        long c = System.currentTimeMillis();
        System.out.println(getCount(all));
        long d = System.currentTimeMillis();
        System.out.println(d - c);
        //修改题目，增加一个一次爬三级
        //可以剩一级，一次到顶
        //可以剩两级，一次一级或一次两级
        //可以剩三级，一次一级，或一级二级，或一次三级
        long bll = 20L;
        System.out.println(getCount(bll));
    }

    public static long getCount(int all, long count) {

        //程序的出口，当剩余的台阶为0时，结束程序
        if (all <= 1) {
            return ++count;
        }

        //当台阶数大于等于2时
        //用count接收返回值
        //只有当执行到底时，走完台阶，方法数才加一
        count = getCount(all - 1, count);
        count = getCount(all - 2, count);
        return count;

    }

    public static long getCount(int all) {

        if (all == 1) {
            return 1;
        }

        if (all == 2) {
            return 2;
        }

        return getCount(all - 1) + getCount(all - 2);
    }

    public static long getCount(long all) {

        if (all == 1) {
            return 1;
        }

        if (all == 2) {
            return 2;
        }

        if (all == 3) {
            return 4;
        }

        return getCount(all - 1) + getCount(all - 2) + getCount(all - 3);
    }
}
