package xuan.demo1面向对象入门.demo3数组的访问;

public class Demo1 {
    public static void main(String[] args) {
        // 要求：某班级有同学的年龄如下：12, 24
        int[] ages = new int[]{12, 24, 36};
        //              索引：   0   1   2

        // 数组的访问格式：数组名[索引]
        // 获取数组中的元素的值
        System.out.println(ages[0]);
        System.out.println(ages[2]);

        ages[0] = 666;

        System.out.println(ages[0]);// 666

        // 数组的元素个数：数组名.length
        System.out.println("数组长度：" + ages.length);

        // 数组的最大索引：数组长度 - 1 （数组名.length)11
        System.out.println("数组最大索引：" + (ages.length - 1));

        // 超过数组的最大值索引：ArrayIndexOutOfBoundsException(数组索引越界异常)
        System.out.println(ages[3]);
    }
}
