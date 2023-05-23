package com.cetc.animalDemo;

public class Cats extends Animal {

    public Cats() {
    }

    public Cats(String name, int age) {
        super(name, age);
    }

    public String toString() {
        if(getAge() == 0){
            return "Unknown";
        }
        return "Cats{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        if (getAge() == 0) {
            System.out.println("一只十分神秘的猫在十分神秘地吃十分神秘的食物");
        } else {
            System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的神秘的猫正在吃十分神秘的食物");
        }
    }
}
