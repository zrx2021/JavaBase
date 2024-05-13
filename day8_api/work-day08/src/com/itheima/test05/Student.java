package com.itheima.test05;

public class Student {
    private String id; // 学号
    private String name; // 姓名
    private double height; // 身高

    public Student() {
    }

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}