package com.cetc.animalDemo;

public class Husky extends Dogs {

    public Husky() {
    }

    public Husky(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Husky{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇正在吃骨头，边吃边拆家");
    }
}
