package com.itheima.test05;

/*
求出1到100之间的既是3的倍数又是5倍数的数字之和.

程序执行，在控制台输出效果
315
 */
public class Test05 {
    public static void main(String[] args) {
        //求出1到100之间的既是3的倍数又是5倍数的数字之和.
        //我们先要定义一个变量sum 用来记录总和
        int sum = 0;
        //我们需要循环获取1-100之间的值
        for (int i = 1; i <= 100; i++) {
            //我们需要判断这个值是否为3的倍数同时也是5的倍数
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        //在循环之外，sum即为总和
        System.out.println(sum);
    }
}
