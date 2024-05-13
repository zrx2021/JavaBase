package xuan.demo1面向对象入门.demo1;

import java.util.Random;
import java.util.Scanner;

/*
一个大V直播时发起了抢红包活动，分别有：9、666、188、520、99999五个红包。 请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，
注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）：
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {9, 666, 188, 520, 99999};
        redPacket(arr);
    }

    public static void redPacket(int[] arr) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("按任意键抢红包：");
            sc.nextInt();
            System.out.println("恭喜你抽中了：" + arr[i]);
        }
    }

}
