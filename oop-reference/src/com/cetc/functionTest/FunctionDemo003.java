package com.cetc.functionTest;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo003 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        //创建一个数组将数据存入数组中
        /*Arrays.stream(list.toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                Integer[] arr = new Integer[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    arr[i] = list.get(i);
                }
                return arr;
            }
        })).forEach(System.out::println);*/

        //用方法引用的方法
        Arrays.stream(list.toArray(Integer[]::new)).forEach(System.out::println);
    }
}
