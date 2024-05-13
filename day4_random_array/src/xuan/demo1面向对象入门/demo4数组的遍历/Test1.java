package xuan.demo1面向对象入门.demo4数组的遍历;

public class Test1 {
    public static void main(String[] args) {
        // 1.定义数组保存的所有销售额
        int[] sell = {16, 26, 36, 6, 100};

        // 2.定义求和变量，保存总和
        int total = 0;

        // 3.遍历数组获取每个元素，求和
        for (int i = 0; i < sell.length; i++) {
            total += sell[i];
        }

        // 4.打印总和
        System.out.println(total);
    }
}
