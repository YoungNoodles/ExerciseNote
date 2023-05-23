package com.CETC.a01polymorphismDemo1;

public class Father {
    private String name;

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println(name);
    }

    public void eat() {
        System.out.println(name + " 正在吃饭");
    }

    public void drink(){
        System.out.println(name + " 正在喝水");
    }
}
