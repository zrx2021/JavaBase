package com.itheima.test09;

import java.util.Scanner;

/*
9.
目标：能够使用三元运算进行数据的判断。能够使用键盘录入的知识点，实现输入数据到程序中

1.需求
    键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
    程序执行，在控制台输出效果
    请输入一个整数:
    18
    偶数

2. 知识点
    键盘录入
    三元运算

3.思路分析
    1.先创建一个Java程序，创建main方法
    2.使用Scanner，实现键盘输入整数保存到程序中【键盘录入三部曲：导包，创建对象，接收数据，接收整数要用sc.nextInt()】
    3.使用三元运算判断键盘录入的整数是否为偶数。nunber % 2 == 0 如果满足条件就返回 偶数，如果不满足条件，则返回奇数，使用变量接收返回的结果
    4.输出结果
*/
public class Test09 {
    public static void main(String[] args) {
        //先创建键盘录入对象，接收一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        //使用三元运算判断这个整数是奇数还是偶数
        // 数据类型 变量名   = 关系表达式 ? 值1 : 值2;
        String str = number % 2 == 0 ? "偶数" : "奇数";
        System.out.println(str);
    }
}
