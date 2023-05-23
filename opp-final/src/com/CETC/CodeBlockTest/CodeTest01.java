package com.CETC.CodeBlockTest;

public class CodeTest01 {
    private String name;
    private String age;
    private String gender;

    //构造代码块（没用的废物）
    {
        System.out.println("--看看谁先运行，构造代码块");
    }

    public CodeTest01() {
        System.out.println("--看看谁先运行，空参构造");
        //局部代码块（也成了没用的废物）
        {
            System.out.println("--我来了！局部代码块");
            int a = 1;
            System.out.println("--我等于"+a);
        }
        System.out.println("--我走了！局部代码块");
    }

    public CodeTest01(String name, String age, String gender) {
        System.out.println("--看看谁先运行，全参构造");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
