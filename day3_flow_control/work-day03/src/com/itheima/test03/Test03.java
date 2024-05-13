package com.itheima.test03;

import java.util.Scanner;

/*
已知有一个系统上对应有以下功能：1.查询账户，2.存款，3.取款，4.转账，5.修改密码，6.退出，7.注销账户。
需求：从键盘输入一个数字，代表选择对应的一个功能。请编写代码实现

程序执行，在控制台输出效果
请输入您的操作:
1
用户选择了查询账户的功能...
 */
public class Test03 {
    public static void main(String[] args) {
        // 先使用键盘录入，录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入与您的操作:");
        int choose = sc.nextInt();

        // 使用switch语句搭建这个页面功能
        switch (choose) {
            case 1:
                System.out.println("用户选择了查询账户的功能");
                break;
            case 2:
                System.out.println("用户选择了存款的功能");
                break;
            case 3:
                System.out.println("用户选择了取款的功能");
                break;
            case 4:
                System.out.println("用户选择了转账的功能");
                break;
            case 5:
                System.out.println("用户选择了修改密码的功能");
                break;
            case 6:
                System.out.println("用户选择了退出的功能");
                break;
            case 7:
                System.out.println("用户选择了注销账户的功能");
                break;
            default:
                System.out.println("您输入的操作有误");
        }
    }
}
