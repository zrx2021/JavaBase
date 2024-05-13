package com.itheima.test02;

/*
2.目标：掌握八种基本数据类型的基本定义
1.需求
要存储一个学员的姓名(杨密)、性别(女)、年龄(22)、分数(88.5)，请选择对应的类型去定义变量，把这些信息定义为变量
  tips: 可以使用下面的名称
    姓名: name
    性别: gender
    年龄: age
    分数: score

程序执行，在控制台输出效果

--------学生信息---------
    姓名:杨密
    性别:女
    年龄:22
    分数:88.5

2.知识点
    变量的定义
    数据类型

3.思路分析
    1.先创建一个Java程序，创建main方法
    2.定义变量代表姓名name,类型是字符串类型String，为其赋值。
    3.定义变量代表性别gender,这里因为是一个字符，可以选择类型是字符串类型String，也可以选择字符类型char，为其赋值。
    4.定义变量代表年龄age,类型是整数类型int，为其赋值。
    5.定义变量代表分数score,类型是小数类型double，为其赋值。
    6.按照格式打印数数据，输出字符串和变量时，要使用+进行拼接。例如,System.out.println("name:" + name);
*/
public class Test02 {
    public static void main(String[] args) {
        String name = "杨密";
        char gender = '女';
        int age = 22;
        double score = 88.5;
        System.out.println("-------学生信息------");
        System.out.println("姓名:" + name);
        System.out.println("性别:" + gender);
        System.out.println("年龄:" + age);
        System.out.println("分数:" + score);
    }
}
