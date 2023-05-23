package com.CETC.a02PackageTest;

public class Student {
    private String ID;
    private String password;
    private String name;

    public Student() {
    }

    public Student(String ID, String password, String name) {
        this.ID = ID;
        this.password = password;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
