package com.itheima.test10;

import java.util.Scanner;

/*
10.
目标：能够使用三元运算进行数据的判断。能够使用键盘录入的知识点，实现输入数据到程序中

1.需求
    键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”

    程序执行，在控制台输出效果
    请输入一个分数:
    100
    及格

2.知识点
    键盘录入
    三元运算

3.思路分析
    1.先创建一个Java程序，创建main方法
    2.使用Scanner，实现键盘输入整数保存到程序中【键盘录入三部曲：导包，创建对象，接收数据，接收整数要用sc.nextInt()】
    3.使用三元运算判断键盘录入的整数是否大于等于60。score >= 60 如果满足条件就返回 及格，如果不满足条件，则返回不及格，使用变量接收返回的结果
    4.输出结果
*/
public class Test10 {
    public static void main(String[] args) {
        //使用键盘录入，接收一个整数，代表分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int score = sc.nextInt();

        //使用三元运算，判断这个值是否大于等于60
        String str = score >= 60 ? "及格" : "不及格";
        System.out.println(str);
    }
}
