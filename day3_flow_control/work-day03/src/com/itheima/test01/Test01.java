package com.itheima.test01;

/*
红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
那么红茶和绿茶现在的钱一样多，请问对么？请编写程序进行判断。
 */
public class Test01 {
    public static void main(String[] args) {
        int red = 21 * 2 + 3; // 几天之后红茶妹妹的钱
        int green = 24 * 2; // 几天之后，绿茶妹妹的钱

        if (red == green) {
            System.out.println("对");
        } else {
            System.out.println("不对");
        }
    }
}
