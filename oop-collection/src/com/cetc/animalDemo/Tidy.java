package com.cetc.animalDemo;

public class Tidy extends Dogs {

    public Tidy() {
    }

    public Tidy(String name, int age) {
        super(name,age);
    }

    public String toString() {
        return "Tidy{" + getName() + "，" + getAge() + "}";
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的泰迪正在吃骨头，边吃边蹭蹭");
    }
}
