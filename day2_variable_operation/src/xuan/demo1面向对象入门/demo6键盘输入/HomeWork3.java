package xuan.demo1面向对象入门.demo6键盘输入;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double height;
        System.out.println("请输入你的姓名：");
        name = sc.next();
        System.out.println("请输入你的年龄：");
        age = sc.nextInt();
        System.out.println("请输入你的身高：");
        height = sc.nextDouble();
        System.out.println("我的姓名是" + name + "，年龄" + age + "身高" + height + "CM");
    }
}
