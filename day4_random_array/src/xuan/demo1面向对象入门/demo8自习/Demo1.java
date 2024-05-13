package xuan.demo1面向对象入门.demo8自习;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
