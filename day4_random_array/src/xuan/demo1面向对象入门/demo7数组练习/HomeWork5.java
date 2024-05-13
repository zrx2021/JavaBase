package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            arr[i] = sc.nextInt();
        }
        System.out.println("数组的最终元素是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ");
        }
    }
}
