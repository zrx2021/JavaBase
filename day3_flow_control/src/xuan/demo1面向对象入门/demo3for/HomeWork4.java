package xuan.demo1面向对象入门.demo3for;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = 100; i <= end; i++) {
            if (i / 100 == 3) {
                continue;
            }
            if (i / 10 % 10 == 5) {
                continue;
            }
            if (i % 10 == 7) {
                continue;
            }
            sum += i;
        }
        System.out.println("100到300之间符合条件的数据总和为：" + sum);
    }
}
