package com.itheima.test03;

/*
3.
1.需求
    练习基本数据类型之间的相互转换
    定义int类型变量,为其赋值为10，将其赋值给double类型，查看结果。
    定义byte类型变量，为其赋值100，将其赋值给short类型，查看结果。
    定义byte类型变量，为其赋值80，将其赋值给int类型，查看结果。
    定义double类型变量，为其赋值3.66，将其赋值给int类型，查看结果。

程序执行，在控制台输出效果
    10.0
    100
    80
    3

2.知识点
    自动类型转换
    强制类型转换 ， 格式： 目标数据类型 变量名 = (数据类型) 值;

3.思路分析
    基本数据类型，从小到大的排序为:
        byte < short < int < long < float < double
        char < int < long < float < double
    1.先创建一个Java程序，创建main方法
    2.定义一个int的变量a,为其赋值10。
    3.定义double类型的变量b，直接接收a,输出b的值。小转大，直接赋值
    4.定义一个byte的变量c,为其赋值100。
    5.定义short类型的变量d，直接接收c,输出d的值。小转大，直接赋值
    6.定义一个byte的变量e,为其赋值80。
    7.定义int类型的变量f，直接接收e,输出f的值。小转大，直接赋值
    8.定义一个double类型的变量g,为其赋值3.66。
    9.定义int类型的变量h，把g进行强制类型转换后再赋值个h,输出h的值。大转小，需要强制类型转换
*/
public class Test03 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("b = " + b);

        byte c = 100;
        short d = c;
        System.out.println("d = " + d);

        byte e = 80;
        int f = e;
        System.out.println("f = " + f);

        double g = 3.66;
        int h = (int)g;
        System.out.println("h = " + h);
    }
}
