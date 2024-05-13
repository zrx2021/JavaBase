package xuan.demo1面向对象入门.demo3数组的访问;

/*
需求：创建一个数组，可以存放5个小数： 分别为 11.11, 22.22, 33.33, 44.44, 55.55
    要求先把数组的每个元素除以2, 再把数组的元素输出来

    // 1.定义数组存放数据
    // 2.拿到数据, 除以2, 设置回原来的位置
    // 3.输出数组数据
*/
public class Test1 {
    public static void main(String[] args) {
        double[] numbers = {11.11, 22.22, 33.33, 44.44, 55.55};
        double[] numbers2 = {11.11, 22.22, 33.33, 44.44, 55.55};

        numbers[0] /= 2;
        numbers[1] /= 2;
        numbers[2] /= 2;
        numbers[3] /= 2;
        numbers[4] /= 2;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("---------------------");

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers[" + i + "]" + (numbers2[i] /= 2));
        }
    }
}
