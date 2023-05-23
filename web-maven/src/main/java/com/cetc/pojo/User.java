package com.cetc.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String IPaddr;


    public User() {
    }

    public User(Integer id, String name, String password, String gender, String address) {
        this.id = id;
        this.username = name;
        this.password = password;
        this.gender = gender;
        this.IPaddr = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return address
     */
    public String getIPaddr() {
        return IPaddr;
    }

    /**
     * 设置
     * @param IPaddr
     */
    public void setIPaddr(String IPaddr) {
        this.IPaddr = IPaddr;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + username + ", password = " + password + ", gender = " + gender + ", address = " + IPaddr + "}";
    }
}
