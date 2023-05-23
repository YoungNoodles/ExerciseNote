package com.cetc.functionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo001 {
    public static void main(String[] args) {
        String[] arr = {"豆浆，10", "汤圆，11", "吐司，13", "可乐，14", "火锅，15", "腊肠，16", "肉松，17", "油条，18"};

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
//使用流式直接编写
//        List<Student> list2 = list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String[] arr = s.split("，");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                return new Student(name, age);
//            }
//        }).toList();

        //使用方法调用改写
        List<Student> list2 = list.stream().map(Student::new).toList();
        System.out.println(list2);
    }
}
