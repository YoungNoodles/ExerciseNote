package com.CETC.Test01;

public class Animal {
    private String name;
    String type;
    protected String age;
    public String master;

    public Animal() {
    }

    public Animal(String name, String type, String age, String master) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void showInformation() {
        //本类中可以调用所有权限修饰的变量、方法
        System.out.println(name + "," + type + "," + age + "," + master);
    }
}
