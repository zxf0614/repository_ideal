package com.itheima.domain;

public class User {
    private String name;
    private int age;

    private String address;

    private String jjj;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
