package homework4;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 20;
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
