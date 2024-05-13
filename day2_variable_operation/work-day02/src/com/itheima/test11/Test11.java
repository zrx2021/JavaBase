package com.itheima.test11;

import java.util.Scanner;

/*
11.
目标：能够使用键盘录入的知识点，实现输入数据到程序中

1.需求
键盘录入自己的姓名(String),年龄(int),身高(double)保存到对应的变量中,输出结果如:我的姓名是张三,年龄25岁,身高180CM(提示姓名是String类型,需要使用Scanner的next()方法.)

程序执行，在控制台输出效果
    请输入你的姓名:
    张三
    请输入你的年龄:
    25
    请输入你的身高:
    180
    我的姓名是张三,年龄25岁,身高180CM

2.知识点
键盘录入

3.思路分析
    1.先创建一个Java程序，创建main方法
    2.使用Scanner，实现键盘输入整数保存到程序中【键盘录入三部曲：导包，创建对象，接收数据，接收整数要用sc.nextInt()】
    3.先使用输出语句输出提示语，然后使用键盘录入的对象实现录入数据。录入字符串用next()方法，录入整数用nextInt()方法，录入小数用nextDouble()方法
    4.把内容拼接成指定的格式输出
*/
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name = sc.next();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("请输入你的身高");
        double height = sc.nextDouble();
        System.out.println("我的姓名是" + name + ",年龄" + age + "岁,身高" + height + "CM");
    }
}
