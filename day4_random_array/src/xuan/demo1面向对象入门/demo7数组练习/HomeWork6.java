package xuan.demo1面向对象入门.demo7数组练习;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[3];
        Random r = new Random();
        int sum = 0;
        System.out.println("新数组的元素是:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[r.nextInt(10) + 1];
            sum += arr2[i];
            System.out.print(i == arr2.length - 1 ? arr2[i] + "\n" : arr2[i] + " ");
        }
        System.out.println("新数组的和是：");
        System.out.println(sum);
    }
}
