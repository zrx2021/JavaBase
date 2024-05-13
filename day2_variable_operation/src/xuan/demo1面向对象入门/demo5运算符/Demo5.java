package xuan.demo1面向对象入门.demo5运算符;

public class Demo5 {
    public static void main(String[] args) {
        // 1.判断成绩是否及格，成绩大于等于60显示及格，否则显示不及格
        int score = 56;
        String ret = score >= 60 ? "及格" : "不及格";
        System.out.println("ret = " + ret);

        // 2.找两个数的较大值， 打印较大值
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("max = " + max);

        // 3.判断一个数是奇数还是偶数，打印奇数或偶数 能被22整除的是偶数，不能被2整除的是奇数
        int n = 7;
        String ret2 = n % 2 == 0 ? "偶数" : "奇数";
        System.out.println(n + "是" + ret2);
    }
}
