package xuan.demo1面向对象入门.demo1方法介绍;

/*
需求：定义一个方法，实现判断这个数字10是奇数还是偶数(evenNumber)，如果是奇数则输出false ，如果是偶数则输出true
 */
public class Test1 {
    public static void main(String[] args) {
        isEvenNumber();
    }

    private static void isEvenNumber() {
        int a = 20;
        boolean state = a % 2 == 0;
        System.out.println(state);
    }
}
