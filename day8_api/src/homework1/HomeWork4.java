package homework1;

import java.util.Scanner;

/*
实现模拟登录。现在已知某一个系统中注册了一个用户信息。
账号密码分别为："gzitheima" , "loveJava" 。
现在模拟用户登录，提示用户输入账号和密码。同时，使用【练习三】中的方法得到一个验证码，提示用户输入验证码。
如果用户输入的账号、密码和验证码都正确，则提示用户登录成功。根据对应的情况，提示用户进行正确的操作。
注意，账号和密码是严格区分大小写。验证码可以忽略大小写
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入登录名:");
        String userName = sc.next();
        System.out.println("请输入登录密码:");
        String password = sc.next();
        String checkCode = HomeWork3.generateCode(5);
        System.out.println("系统生成验证码为：" + checkCode);
        System.out.println("请输入验证码：");
        String inputCode = sc.next();
        //boolean flag = true;
        //if (!userName.equals("gzitheima") || !password.equals("loveJava")) {
        //    System.out.println("系统提示：您输入的账号或者密码有误");
        //    flag = false;
        //}
        //if (!inputCode.equalsIgnoreCase(checkCode)) {
        //    System.out.println("系统提示：您输入的验证码有误");
        //    flag = false;
        //}
        //if (flag) {
        //    System.out.println("系统提示：欢迎您进入系统!");
        //}
        if (inputCode.equalsIgnoreCase(checkCode)) {
            if (userName.equals("gzitheima") && password.equals("loveJava")) {
                System.out.println("系统提示：欢迎您进入系统!");
            } else {
                System.out.println("系统提示：您输入的账号或者密码有误");
            }
        } else {
            System.out.println("系统提示：您输入的验证码有误");
        }
    }
}
