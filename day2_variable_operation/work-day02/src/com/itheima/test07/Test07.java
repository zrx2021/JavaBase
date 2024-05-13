package com.itheima.test07;

/*
7.目标：掌握关系运算符的作用，以及能够使用逻辑运算符连接多个关系表达式

1.需求
    模拟用户在某东上搜索手机信息：用户想搜索一台价格是在4000到6000之间的手机，现在有一台手机，价格是5000块，使用程序输出当前手机是否符合用户的要求
    程序执行，在控制台输出效果
    当前手机的价格是否符合用户要求: true

2.知识点
    变量的定义
    关系运算符
    逻辑运算符

3.思路分析
    1.先创建一个Java程序，创建main方法
    2.定一个小数变量代表价格price，为其赋值为5000。
    3.使用关系表达式，表示当前价格是否在4000到6000之前:  price >= 4000 && price <= 6000
    4.输出结果
*/
public class Test07 {
    public static void main(String[] args) {
        // double price = 5000;
        // System.out.println("当前手机的价格是否符合用户要求：" + (price >= 4000 && price <= 6000));

        double price = 5000;
        boolean result = price >= 4000 && price <= 6000;
        System.out.println("当前手机的价格是否符合用户要求：" + result);
    }
}
