package xuan.demo1面向对象入门.demo2switch;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的操作：");
        int operate = sc.nextInt();
        switch (operate) {
            case 1:
                System.out.println("用户选择了查询账户的功能……");
                break;
            case 2:
                System.out.println("用户选择了存款的功能……");
                break;
            case 3:
                System.out.println("用户选择了取款的功能……");
                break;
            case 4:
                System.out.println("用户选择了转账的功能……");
                break;
            case 5:
                System.out.println("用户选择了修改密码的功能……");
                break;
            case 6:
                System.out.println("用户选择了退出的功能……");
                break;
            case 7:
                System.out.println("用户选择了注销用户的功能……");
                break;
            default:
                System.out.println("未知的功能……");
        }
    }
}
