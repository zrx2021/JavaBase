package xuan.demo1;

import java.util.Random;

/*
利用随机数生成5个范围为1-100（包含1和100）之间的随机数存入数组（随机数可重复），
遍历数组求和并打印在控制台，之后获取数组中角标和对应的元素都为偶数的元素（0也是偶数），并打印在控制台。
 */
public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
        }
        System.out.println("数组的和是：" + sum);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                System.out.println("当前角标：" + i + "当前元素：" + arr[i]);
            }
        }
    }
}
