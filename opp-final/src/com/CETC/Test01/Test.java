package com.CETC.Test01;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("小甜甜","怪物","一千万岁","肚子里");
        Cat c = new Cat("小甜甜","怪物","一千万岁","肚子里");
        //在本包中的无关类
        //可以直接调用【默认】权限、【protected】权限、【public】权限
        //不可直接调用【private】权限
        showInformation(a);
        a.showInformation();
        c.showInformation();
    }

    public static void showInformation(Animal a){
        System.out.println(a.getName() + "," + a.type + "," + a.age + "," + a.master);
    }
}
