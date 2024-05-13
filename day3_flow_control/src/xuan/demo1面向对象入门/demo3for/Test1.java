package xuan.demo1面向对象入门.demo3for;

public class Test1 {
    public static void main(String[] args) {
        // 需求1：使用for循环批量生产数据1到5的数据
        for (int i = 1; i < 6; i++) {
            System.out.println("当前数据" + i);
        }

        System.out.println("=======================");

        // 需求2：使用for循环批量产生数据22到28的数据
        for (int i = 22; i <= 28; i++) {
            System.out.println("当前数据" + i);
        }

        System.out.println("=======================");

        // 需求3：使用for循环求1~5中所有整数的和

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1到5的和是：" + sum);
    }
}
