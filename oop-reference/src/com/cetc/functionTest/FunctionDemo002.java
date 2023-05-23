package com.cetc.functionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo002 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bb","ccc","dd","e","ff","g","hhh");

        //先不用方法调用
//        list.stream().map(new Function<String, String>() {
//
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(s -> System.out.println(s));

        //方法调用
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        list.stream().map(s -> s.substring(0,1)).forEach(System.out::println);

    }
}
