package xuan.demo1面向对象入门.demo6方法参数传递;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {10, 20 ,30};
        multiplyPrint(arr);
    }

    public static void multiplyPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);
        }
    }
}
