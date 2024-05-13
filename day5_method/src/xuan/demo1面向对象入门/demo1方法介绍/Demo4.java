package xuan.demo1面向对象入门.demo1方法介绍;

public class Demo4 {
    public static void main(String[] args) {
        isEvenNumber(20);
    }

    public static void isEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }
}
