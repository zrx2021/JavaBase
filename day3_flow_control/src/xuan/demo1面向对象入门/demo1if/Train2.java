package xuan.demo1面向对象入门.demo1if;

import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int k = sc.nextInt();
        if (i < j && i < k) {
            System.out.println(i + "最小");
        } else if (j < k && j < k) {
            System.out.println(j + "最小");
        } else {
            System.out.println(k + "最小");
        }
    }
}
