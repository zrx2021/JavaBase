package xuan.demo1面向对象入门.demo4while;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的密码：");
        int input = sc.nextInt();
        while (input != 123456){
            System.out.println("您输入的密码错误，请重新输入您的密码：");
            input = sc.nextInt();
        }
        System.out.println("欢迎进入到系统");
    }
}
