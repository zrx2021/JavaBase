package xuan.demo1面向对象入门.demo2switch;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付方式：");
        int payWay = sc.nextInt();
        switch (payWay) {
            case 1:
                System.out.println("支付宝");
                break;
            case 2:
                System.out.println("微信");
                break;
            case 3:
                System.out.println("银联");
                break;
            default:
                System.out.println("不明支付方式");
        }
    }
}
