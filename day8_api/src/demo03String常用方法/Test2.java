package demo03String常用方法;

import java.util.Scanner;

/*
系统正确的登录名和密码是：itheima/123456，请在控制台开发一个登录界面，接收用户输入的登录名和密码，判断用户是否登录成功，
登录成功后展示：“欢迎进入系统!”，即可停止程序（注意：要求最多给用户三次登录机会）
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入登录名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (userName.equals("itheima") && password.equals("123456")) {
                System.out.println("欢迎进入系统");
                break;
            } else {
                System.out.println("登录失败，还有" + (2 - i) + "次机会");
            }
        }
    }
}
