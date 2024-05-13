package com.itheima.test04;

/*
4.
1.需求
创建一个Java程序，
    1.定义两个byte类型的变量，分别赋值为10和20。使用程序计算这两个变量相加的结果，并且使用变量接收运算结果。
    2.定义一个byte类型的变量赋值为10，一个char类型的变量赋值为'a',一个float类型的变量赋值为5.2，一个double类型的变量赋值为10，
    使用程序计算这些变量相加的结果，并且使用变量接收运算结果。

程序执行，在控制台输出效果
    30
    122.2

2. 知识点
    变量的定义
    表达式的自动类型转换

3. 思路分析
    转化规则：表达式的最终类型取决于当前表达式的最高数据类型
    注意事项：byte ,short , char 在运算的过程中会提升为int类型
    1.先创建好一个Java程序，创建main方法
    2.分别定义两个byte类型的变量，变量名是a和b。分别给他们赋值为10和20
    3.定义一个int类型的变量去接收a + b的结果。因为结果会提升为int
    4.定义byte类型变量,char类型变量,float类型变量和double类型变量，分别给他们赋值。
    5.定义一个double类型的变量去接收他们的运算结果。表达式的最高类型为double， 所以使用double类型的变量去接收
*/
public class Test04 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;
        System.out.println("c = " + c);

        byte d = 10;
        char e = 'a';
        float f = 5.2F;
        double g = 10;
        double sum  = d + e + f + g;
        System.out.println("sum = " + sum); // 122.22   小数float/double不完全准确,会有精度问题  浮点型
    }
}
