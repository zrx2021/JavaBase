package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            boolean flag = true;
            int number = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] == number) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i] = number;
                i++;
            }
        }

        System.out.println("数组的元素是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ");
        }
    }
}
