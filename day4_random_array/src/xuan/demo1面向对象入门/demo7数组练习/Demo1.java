package xuan.demo1面向对象入门.demo7数组练习;
/*
目标：掌握数组元素求最值
    需求：选美比赛有6个美女参加，她们的颜值分别为：15, 9000, 10000, 20000, 9500, -5，求出数组的最大值

    // 1.把颜值数据用数组装起来
    // 2.定义一个变量max用于记录最终的最大值
    // 3.遍历数组的每个元素
    // 4.如果遍历的当前数据大于max变量存储的数据，则替换变量max存储的数据为当前数据
    // 5.循环结束后输出max变量即可
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] faceScore = new int[]{15, 9000, 10000, 20000, 9500, -5};
        // 如果数组全为负数，初始化为0，则最大为0，所以通常取数组第一个数作为临时最大值
        int max = faceScore[0];

        for (int i = 1; i < faceScore.length; i++) {
            if (faceScore[i] > max) {
                max = faceScore[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
