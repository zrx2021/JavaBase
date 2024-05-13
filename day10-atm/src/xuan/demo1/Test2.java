package xuan.demo1;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 20;
            if (i % 2 == 1 && arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
