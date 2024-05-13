package xuan.demo1面向对象入门.demo2switch;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        switch (number) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("差评");
                break;
            case 8:
                System.out.println("及格");
                break;
            case 9:
                System.out.println("良好");
                break;
            case 10:
                System.out.println("优秀");
                break;
            default:
                System.out.println("非法值");
        }
    }
}
