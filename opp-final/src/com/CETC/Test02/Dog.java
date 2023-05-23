package com.CETC.Test02;

import com.CETC.Test01.Animal;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String type, String age, String master) {
        super(name, type, age, master);
    }

    public void showInformation() {
        //其他包中的子类
        //可以直接调用【protected】权限、【public】权限
        //不可以直接调用【private】权限、【默认】权限
        System.out.println(getName() + "," + getType() + "," + age + "," + master);
    }
}
