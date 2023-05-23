package com.CETC.a02polymorphismDemo2;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String age, String color) {
        super(age, color);
    }

    public String catchType() {
        return "狗";
    }

    /**
     * 狗看家
     */
    public void lookHome() {
        System.out.println(getAge() + "的" + getColor() + "的狗在看家");
    }

    /**
     * 狗吃东西
     *
     * @param something
     */
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的" + getColor() + "的狗,两只前腿死死地抱住" + something + "猛吃");
    }
}
