package xuan.demo1面向对象入门.demo8自习;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row = sc.nextInt();
        System.out.println("请输入列数：");
        int column = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
