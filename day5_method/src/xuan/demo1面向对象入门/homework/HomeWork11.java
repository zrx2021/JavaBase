package xuan.demo1面向对象入门.homework;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int n = sc.nextInt();
        method(n);
    }

    public static void method(int n) {
        System.out.println("乘法表：");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
