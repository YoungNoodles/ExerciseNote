package com.cetc.pojo;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private String gender;
    private Date birthday;
    private double admission_score;
    private String e_mail;
    private String phone;
    private String student_status;


    public Student() {
    }

    public Student(int id, String name, String gender, Date birthday, double admission_score, String e_mail, String phone, String student_status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.admission_score = admission_score;
        this.e_mail = e_mail;
        this.phone = phone;
        this.student_status = student_status;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return admission_score
     */
    public double getAdmission_score() {
        return admission_score;
    }

    /**
     * 设置
     * @param admission_score
     */
    public void setAdmission_score(double admission_score) {
        this.admission_score = admission_score;
    }

    /**
     * 获取
     * @return e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * 设置
     * @param e_mail
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return student_status
     */
    public String getStudent_status() {
        return student_status;
    }

    /**
     * 设置
     * @param student_status
     */
    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", gender = " + gender + ", birthday = " + birthday + ", admission_score = " + admission_score + ", e_mail = " + e_mail + ", phone = " + phone + ", student_status = " + student_status + "}";
    }
}
