package xuan.demo1面向对象入门.demo8自习;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
