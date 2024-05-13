package xuan.demo1面向对象入门.demo1if;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
        * 键盘输入一个身高，160以下显示矮小身材，[160, 180)显示标准身材，180以上显示高挑身材
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高");
        double height = sc.nextDouble();
        if (height < 160) {
            System.out.println("矮小身材");
        } else if (height >= 160 && height < 180) {
            System.out.println("标准身材");
        } else if (height >= 180) {
            System.out.println("高挑身材");
        }
    }
}
