package com.CETC.a02polymorphismDemo2;

public abstract class Pet {
    private String age;
    private String color;

    public Pet() {
    }

    public Pet(String age, String color) {
        this.age = age;
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 定义一个抽象方法，在子类中返回该类宠物的种类
     * 抽象方法也可以传递参数
     *
     * @return
     */
    public abstract String catchType(/*String str*/);

    public void eat(String something) {
        System.out.println("不管输出啥先吃着" + something);
    }
}
