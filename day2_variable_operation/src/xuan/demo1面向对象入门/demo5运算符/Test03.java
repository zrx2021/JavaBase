package xuan.demo1面向对象入门.demo5运算符;

public class Test03 {


    public static void main(String[] args) {
    // 求三个数字的最小值
        int a = 1;
        int b = 2;
        int c = 3;
        int temp = a;
    // 先比较前面两个数字，获取出较小值
        temp = a < b ? a : b;
    // 再使用较小值和第三个数字进行比较即可获取最小值
        System.out.println(temp < c ? temp : c);
        int age = 0;
        String isAdult = age >= 18 ? "成年" : "未成年";
        System.out.println(isAdult);
    }
}
