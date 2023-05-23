package com.CETC.Test01;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String type, String age, String master) {
        super(name, type, age, master);
    }

    public void showInformation() {
        //本包中的子类
        //可以直接调用【默认】权限、【protected】权限、【public】权限
        //不能直接调用【private】权限
        System.out.println(getName() + "," + type + "," + age + "," + master);
    }
}
