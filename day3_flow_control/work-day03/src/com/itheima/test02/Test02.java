package com.itheima.test02;

import java.util.Scanner;

/*
键盘录入学生考试成绩，判断学生等级:
    90-100	优秀
    80-90	好
    70-80	良
    60-70	及格
    60以下   不及格

程序执行，在控制台输出效果
请输入学生的分数:
95
优秀
 */
public class Test02 {
    public static void main(String[] args) {
        // 使用键盘录入，录一个分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的分数");
        int score = sc.nextInt();

        // 根据分数进行判断，看所属哪个区间
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("输入的数据有误");
        }
    }
}
