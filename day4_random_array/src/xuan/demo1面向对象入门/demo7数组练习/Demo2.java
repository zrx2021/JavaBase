package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工工号");
            arr[i] = sc.nextInt();
        }

        System.out.println("数据录入后" + Arrays.toString(arr));

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        System.out.println("交换数据后" + Arrays.toString(arr));
    }
}

