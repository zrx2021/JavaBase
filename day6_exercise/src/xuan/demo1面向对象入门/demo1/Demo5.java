package xuan.demo1面向对象入门.demo1;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 55};
        int[] newArray = arrayCopy(arr);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] arrayCopy(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
