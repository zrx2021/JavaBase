package xuan.demo1面向对象入门.homework;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int m = sc.nextInt();
        System.out.println("请输入列数：");
        int n = sc.nextInt();
        print(m, n);
    }

    public static void print(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
