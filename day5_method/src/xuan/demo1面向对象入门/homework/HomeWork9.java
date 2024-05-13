package xuan.demo1面向对象入门.homework;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomArray(5)));
        System.out.println(Arrays.toString(getRandomArray(7)));
    }

    public static int[] getRandomArray(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        int j = 0;
        while (j < n) {
            int number = r.nextInt(100) + 1;
            boolean flag = true;
            for (int i = 0; i < j; i++) {
                if (number == arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[j] = number;
                j++;
            }
        }
        return arr;
    }
}
