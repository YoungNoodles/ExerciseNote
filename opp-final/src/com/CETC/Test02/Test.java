package com.CETC.Test02;

import com.CETC.Test01.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("小甜甜","怪物","一千万岁","肚子里");
        Dog d = new Dog("小甜甜","怪物","一千万岁","肚子里");
        //在其他包中的无关类
        //可以直接调用【public】权限
        //不可以直接调用【private】权限、【默认】权限、【protected】权限
        showInformation(a);
        a.showInformation();
        d.showInformation();
    }

    public static void showInformation(Animal a){
        System.out.println(a.getName() + "," + a.getType() + "," + a.getAge() + "," + a.master);
    }
}
