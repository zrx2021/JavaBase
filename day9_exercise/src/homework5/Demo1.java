package homework5;

import java.util.ArrayList;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(101));
        }

        int max = list.get(0), min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            sum += value;
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
            if (value < 60) {
                System.out.print(value + " ");
            }
        }

        System.out.println();
        System.out.println("最大值：" + max + "最小值：" + min + "平均值：" + sum * 1.0 / list.size());
    }
}
