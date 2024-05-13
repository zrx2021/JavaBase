package com.itheima.test01;

/*
    1. 私有所有成员变量
    2. 提供get/set方法
    3. 提供无参和满参构造
 */
public class GirlFriend {
    private String name;
    private double height;
    private double weight;

    // 无参的构造
    public GirlFriend() {
    }

    // 满参构造
    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void show() {
        System.out.println("我的女朋友叫" + name + ",身高" + height + "厘米，体重" + weight + "斤");
    }

    // 先提供set方法 【赋值】
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 提供对应的get方法
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
