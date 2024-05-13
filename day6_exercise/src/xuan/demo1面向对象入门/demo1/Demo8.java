package xuan.demo1面向对象入门.demo1;

import java.util.Arrays;
import java.util.Random;

/*
需求: 定义一个方法, 创建一个长度为5的int数组, 随机生成5个范围在[20, 80]之间的整数保存到一个数组中，把数组中所有的奇数元素相加求和。
 */
public class Demo8 {
    public static void main(String[] args) {
        System.out.println("数组中所有的奇数元素和是" + generateArraySum());
    }

    public static int generateArraySum() {
        int sum = 0;
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 20;
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }
}
