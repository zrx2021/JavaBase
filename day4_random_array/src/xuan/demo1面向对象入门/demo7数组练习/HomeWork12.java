package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组大小：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                arr[right] = temp;
                right--;
            } else {
                arr[left] = temp;
                left++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ");
        }
    }
}
