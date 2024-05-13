package com.itheima.test01;


/*
1.
目标：掌握八种基本数据类型的基本定义

1.需求
在IDEA中写一个Java程序，能够分别定义一个整数变量，为其赋值为10，一个float类型的变量，为其赋值13.14。
定义一个long类型的的数据，为其赋值123456789123456;一个布尔类型变量，为其赋值为false。
一个字符变量，为其赋值'我',最后把这些变量的结果输出来。
    程序执行，在控制台输出效果
    10
    13.14
    123456789123456
    false
    我

2. 知识点
    基本数据类型
    变量的定义

3. 思路分析
基本数据类型：
    整数 : byte short int(默认类型) long(如果超过21亿需要加上L/l)
    浮点 : float(要在小数后面加F/f) double(默认类型)
    字符 : char
    布尔 : boolean 只有 true/false两种取值
    1.在IDEA中创建一个Java程序，并且创建main方法
    2.定义一个整数变量，变量定义格式 : 数据类型 变量名 = 值;  整数的类型是int
    3.定义一个小数变量，变量定义格式 : 数据类型 变量名 = 值;  定义的数据类型是float，要注意，float后面要加F/f。
    4.定义一个整数变量，变量定义格式 : 数据类型 变量名 = 值;  定义的数据类型是long，要注意，float后面要加L/l。
    5.定义一个布尔变量，变量定义格式 : 数据类型 变量名 = 值;  定义的数据类型是boolean
    6.定义一个字符变量，变量定义格式 : 数据类型 变量名 = 值;  定义的数据类型是char
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 10;
        float b = 13.14F;
        long c = 123456789123456L;
        boolean d = false;
        char e = '我';

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
