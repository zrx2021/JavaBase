package xuan.demo1面向对象入门.demo1;

public class Test1 {
    public static void main(String[] args) {
        int[] reward = new int[7];
        int n = 10000000;
        for (int i = 0; i < n; i++) {
            int[] arr1 = Demo10.generateLuckyNumbers();
            int[] arr2 = Demo10.generateLuckyNumbers();
            reward[Demo10.compareNumbers(arr1, arr2)]++;
        }
        for (int i = 0; i < reward.length; i++) {
            int count = reward[i];
            switch (i) {
                case 0:
                    System.out.println("没有中奖有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 1:
                    System.out.println("中5元有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 2:
                    System.out.println("中10元有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 3:
                    System.out.println("中200元有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 4:
                    System.out.println("中3000元有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 5:
                    System.out.println("中500万有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                case 6:
                    System.out.println("中1000万有：" + count + "次，概率为" + count * 1.0 / n);
                    break;
                default:
                    System.out.println("错误奖项");
            }
        }
    }
}
