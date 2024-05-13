package xuan.demo1面向对象入门.demo7数组练习;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int multiple = 1;
        int number = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            number += arr[i] * multiple;
            multiple *= 10;
        }

        System.out.println(number);

        int[] arr2 = {1,3,5,7,9};
        //2.定义变量存储最终的整数
        int num = 0;
        //3.对数组进行遍历
        for (int i = 0; i < arr2.length; i++) {
            //4.计算
            num = num * 10 + arr2[i];
        }
        //5.打印结果
        System.out.println(num);
    }
}
