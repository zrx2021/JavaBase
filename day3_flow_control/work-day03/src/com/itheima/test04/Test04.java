package com.itheima.test04;

/*
使用for循环,求出1-100之间的奇数之和。

程序执行，在控制台输出效果
2500
 */
public class Test04 {
    public static void main(String[] args) {
        //求和思路
        //先定义一个变量，用来记录和
        int sum = 0;
        //循环求和
     /*   for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                //实现求和
                sum += i;
            }
        }*/
        for (int i = 1; i <= 100; i+=2) {
            sum += i;
        }


        //循环之外，输出变量，即为总和
        System.out.println(sum);
    }
}
