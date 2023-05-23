package com.cetc.functionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students,"张三，23","李四，24","王五，25","赵六，26");

        List<Student> list = students.stream().map(Student::new).toList();
        list.forEach(System.out::println);

        //将集合中的学生姓名添加到数组当中
        //集合放入流——转换类型：Student类型转换成String类型——存入数组——将数组放入流——遍历输出
        Arrays.stream(list.stream().map(Student::getName).toArray(String[]::new)).forEach(System.out::println);

        //按照“姓名-年龄”的格式将字符串存入数组
        Arrays.stream(list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName() + "-" + student.getAge();
            }
        }).toArray(String[]::new)).forEach(System.out::println);
    }
}
