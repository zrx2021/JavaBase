package xuan.demo1面向对象入门.demo6键盘输入;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        double score = sc.nextDouble();
        System.out.println(score >= 60 ? "及格" : "不及格");
    }
}
