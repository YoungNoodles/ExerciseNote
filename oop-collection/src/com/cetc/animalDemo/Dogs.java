package com.cetc.animalDemo;

public class Dogs extends Animal {

    public Dogs() {
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    public String toString() {
        if (getAge() == 0) {
            return "Unknown";
        }
        return "Dogs{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        if (getAge() == 0) {
            System.out.println("一只十分神秘的狗在十分神秘地吃不可名状的食物");
        } else {
            System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的神秘的狗正在吃不可名状的食物");
        }
    }
}
