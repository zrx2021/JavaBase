package xuan.demo1面向对象入门.homework;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        calculateArraySum(arr);
    }

    public static void calculateArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
