package com.CETC.a01polymorphismDemo1;

public class Son extends Father {
    private String name;

    public Son() {
    }

    public Son(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " 正在吃饭");
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + " 正在喝水");
    }
}
