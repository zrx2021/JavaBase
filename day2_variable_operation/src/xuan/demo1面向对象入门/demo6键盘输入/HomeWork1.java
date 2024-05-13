package xuan.demo1面向对象入门.demo6键盘输入;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        number = sc.nextInt();
        System.out.println(number % 2 == 0 ? "偶数" : "奇数");
    }
}
