package xuan.demo1面向对象入门.demo5运算符;

public class Test01 {
    public static void main(String[] args) {
        double height = 150;
        double weight = 50;
        int age = 50;

        System.out.println(height > 170 && weight < 55);

        System.out.println(height > 170 || weight < 55);

        System.out.println(age >= 18 && age <= 65);
    }
}
