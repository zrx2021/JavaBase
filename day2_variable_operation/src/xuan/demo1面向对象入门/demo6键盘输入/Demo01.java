package xuan.demo1面向对象入门.demo6键盘输入;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();// 等待用户输入，获取用户输入
        System.out.println("age = " + age);

        System.out.println("请输入您的姓名");
        String name = sc.next(); // 获取用户输入的字符串
        System.out.println("name = " + name);

        System.out.println("请输入您的体重：");
        double height = sc.nextDouble();
        System.out.println("height = " + height);
    }
}
