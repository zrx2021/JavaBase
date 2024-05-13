package com.itheima.test08;

import java.util.Scanner;

/*
某商场购物可以打折，具体办法如下：
		普通顾客购满100元打9折
		会员购物打8折
		会员购物满200元打7.5折
	请根据此优惠计划进行购物结算

程序执行，在控制台输出效果
    请输入y/n,y表示为会员，n表示为非会员
    y
    请输入您当前消费金额
    200
    您好，经过打折，您最终消费金额是:150
 */
public class Test08 {
    public static void main(String[] args) {
        // 1.输入是否是会员和消费金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入y/n,y表示为会员，n表示为非会员");
        String isVip = sc.next();

        System.out.println("请输入您当前消费金额");
        double price = sc.nextDouble();
        // 2.根据情况进行打折
        switch (isVip) {
            case "y":
                // 会员
                if (price >= 200) {
                    price *= 0.75; // 会员购物满200元打7.5折
                } else {
                    price *= 0.8; //会员购物打8折
                }
                break;
            case "n":
                // 非会员, 普通顾客购满100元打9折
                if (price >= 100) {
                    price *= 0.9;
                }
                break;
            default:
                System.out.println("你输入的类型不对");
        }

        System.out.println("您好，经过打折，您最终消费金额是: " + price);
    }
}
