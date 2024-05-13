package xuan.demo1面向对象入门.demo1方法介绍;

/*
    需求1：定义一个方法，实现求任意两个整数的最大值
    有参方法调用格式: 方法名(数据)
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("开始");
        getMax(10, 20);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
