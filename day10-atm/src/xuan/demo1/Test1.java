package xuan.demo1;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(91) + 10;
        }
        System.out.println("arr的元素是：" + Arrays.toString(arr));
        int count = getCountOfOverAverage(arr);
        System.out.println("count = " + count);
    }

    public static int getCountOfOverAverage(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum * 1.0 / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        return count;
    }
}
