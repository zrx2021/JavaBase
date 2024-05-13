package xuan.demo1面向对象入门.demo6数组内存图;

/*
    目标：掌握普通变量、数组在计算机中的执行原理，Java程序在计算机中的执行过程
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        int[] arr = new int[] {11, 22, 33};
        //                  索引 0  1   2
        System.out.println(arr); // [I@776ec8df
        System.out.println(arr[1]); // 22

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
