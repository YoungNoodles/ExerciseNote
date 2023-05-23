package com.cetc.animalDemo;

public class Lihua extends Cats {

    public Lihua() {
    }

    public Lihua(String name, int age) {
        super(name,age);
    }

    public String toString() {
        return "Lihua{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫正在吃鱼");
    }
}
