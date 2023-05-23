package com.CETC.a02polymorphismDemo2;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String age, String color) {
        super(age, color);
    }

    public String catchType() {
        return "猫";
    }

    /**
     * 猫抓老鼠
     */
    public void catchMouse() {
        System.out.println(getAge() + "的" + getColor() + "的猫在抓老鼠");
    }

    /**
     * 猫吃东西
     *
     * @param something
     */
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的" + getColor() + "的猫,眯着眼睛侧着头吃" + something);
    }
}
