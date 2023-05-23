package com.cetc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ReferenceTest001 {
    public static void main(String[] args) {
        //集合过滤
        //所有以“张”开头的，名字是三个数的
        //“张无忌”，“周芷若”，“赵敏”，“张强”，“张三丰”
        ArrayList<String> arrList = new ArrayList<>();
        Collections.addAll(arrList,"张无忌","赵敏","周芷若","张强","张三丰");
        arrList.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);

        Random ra = new Random();

        /*for (int i = 0; i < 10; i++) {
            System.out.print(ra.nextInt(9) + 1);
        }*/

    }
}
