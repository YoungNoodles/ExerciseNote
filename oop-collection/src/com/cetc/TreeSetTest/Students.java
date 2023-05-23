package com.cetc.TreeSetTest;

public class Students implements Comparable<Students>{
    private String name;
    private int age;


    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Students{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Students o) {
        //指定排序规则
        //按年龄大小排序，姓名年龄相同视为同一对象
        //this是要存入的对象，o是已经存在的元素
        //负数是小，存左边，正数是大，存右边，为0是存在，不存
        //验证一下存储的底层结构
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        return this.age - o.getAge();
    }
}
