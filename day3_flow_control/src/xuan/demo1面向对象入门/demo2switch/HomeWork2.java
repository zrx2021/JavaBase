package xuan.demo1面向对象入门.demo2switch;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入y/n,y表示为会员，n表示为非会员");
        String isVip = sc.next();
        System.out.println("请输入您当前消费金额");
        double cost = sc.nextDouble();
        switch (isVip) {
            case "y":
                if (cost >= 200) {
                    cost *= 0.75;
                } else {
                    cost *= 0.8;
                }
                break;
            case "n":
                if (cost >= 100) {
                    cost *= 0.9;
                }
            default:
                System.out.println("您的输入有误");
        }
        System.out.println("您好，经过打折，您最终消费金额是:" + cost);
    }
}
