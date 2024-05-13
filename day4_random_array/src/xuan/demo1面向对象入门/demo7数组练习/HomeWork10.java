package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int number = sc.nextInt();

        if (arr[0] >= number) {
            arr2[0] = number;
            for (int i = 1; i < arr2.length; i++) {
                arr2[i] = arr[i - 1];
            }
        }

        if (arr[arr.length - 1] <= number) {
            for (int i = 0; i < arr2.length; i++) {
                if (i == arr2.length - 1) {
                    arr2[i] = number;
                } else {
                    arr2[i] = arr[i];
                }
            }
        }

        //{12, 14, 23, 45, 66, 68, 70, 77, 90, 91}
        for (int i = 0, j = 0; i < arr2.length - 1; i++, j++) {
            if (arr[i] <= number && number <= arr[i + 1]) {
                arr2[i] = arr[j];
                arr2[i + 1] = number;
                j++;
                for (int k = i + 2; k < arr2.length; k++) {
                    arr2[k] = arr[j];
                    j++;
                }
                break;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i == arr2.length - 1 ? arr2[i] : arr2[i] + " ");
        }
    }
}
