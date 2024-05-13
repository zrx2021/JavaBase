package xuan.demo1面向对象入门.homework;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] arr = {11, 66, 55, 44, 33, 22};
        System.out.println(getArrayMax(arr));
    }

    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
