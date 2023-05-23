package com.cetc.animalDemo;

public class Persian extends Cats {

    public Persian() {
    }

    public Persian(String name, int age) {
        super(name,age);
    }

    public String toString() {
        return "Persian{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的波斯猫正在吃小饼干");
    }
}
