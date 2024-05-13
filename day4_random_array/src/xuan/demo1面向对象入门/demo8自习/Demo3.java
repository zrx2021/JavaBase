package xuan.demo1面向对象入门.demo8自习;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均值是：" + sum * 1.0 / arr.length);
    }
}
