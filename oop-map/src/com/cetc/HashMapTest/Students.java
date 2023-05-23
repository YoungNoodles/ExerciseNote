package com.cetc.HashMapTest;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Students o) {
        //this||o
        //年龄从小到大
        //年龄一样按名字首字母
        //姓名年龄相同视为同一个人
        return this.age - o.getAge() == 0 ? this.name.compareTo(o.getName())  : this.age - o.getAge();
    }
}
