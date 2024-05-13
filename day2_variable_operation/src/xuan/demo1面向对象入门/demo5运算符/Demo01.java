package xuan.demo1面向对象入门.demo5运算符;

// 1.先定义一个变量，记录商品的初始价格
// 2.先对商品升价 + 300
// 3.再打折 6折
// 4.输出打折之后的价格
public class Demo01 {
    public static void main(String[] args) {
        double originPrice = 1000;
        originPrice = originPrice + 300;
        originPrice = originPrice * 0.6;
        System.out.println(originPrice);
    }
}
