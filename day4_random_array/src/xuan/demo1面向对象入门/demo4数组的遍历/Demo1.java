package xuan.demo1面向对象入门.demo4数组的遍历;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        //                索引  0   1   2   3
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // 以上代码是重复代码，只有索引是变化的，可以使用for循环解决

        for (int i = 0; i < arr.length; i++) {
            // i 就是索引 = 0, 1, 2, 3
            int x = arr[i];
            System.out.println(x);
        }

        System.out.println("--------------------------");

        // 遍历数组快捷键：数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
