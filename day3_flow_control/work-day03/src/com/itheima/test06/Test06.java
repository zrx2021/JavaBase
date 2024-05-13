package com.itheima.test06;

/*
在中国历法中有十二生肖年份，2023年是癸卯兔年，请在控制台输出从1949年（包含）到2023年（包含）中所有是兔年的年份。

程序执行，在控制台输出效果
1951
1963
1975
1987
1999
2011
2023
 */
public class Test06 {
    public static void main(String[] args) {
        // 倒过来遍历 - 数字.forr反过来循环 revert
        for (int i = 100; i > 0; i--) {}

        for (int i = 2023; i >= 1949; i -= 12) {
            System.out.println(i);
        }

        System.out.println("-------------------");
        for (int i = 1949; i <= 2023; i++) {
            // 每隔12年就是一个兔年 已知的就是 2023是兔年
            // 设当前的年份为   (2023 - i) %  12 == 0
            if ((2023 - i) % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
