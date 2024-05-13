package xuan.demo1面向对象入门.demo3for;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        // 循环了50次
        // 1 3 5 7 9 .. 97 99
        for (int i = 1; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        sum = 0;

        // 循环了100次，if判断了100次，有50个有用的数字
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
