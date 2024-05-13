package xuan.demo1面向对象入门.demo7数组练习;

public class HomeWork11 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int countEarn = 0;
        int countLose = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                countEarn++;
            } else {
                countLose++;
            }
        }
        System.out.println("赚钱的股票一共有：" + countEarn + "只");
        System.out.println("赔钱的股票一共有：" + countLose + "只");
    }
}
