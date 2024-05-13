package xuan.demo1面向对象入门.demo6数组内存图;

/*
    目标：认识多个变量指向同一个数组对象的形式，并掌握其注意事项
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {11, 22, 33};
        System.out.println(arr1);

        int[] arr2 = arr1;
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);

        // 如果某个数组变量存储的地址是null，那么该变量将不再指向任何数组对象
        arr2 = null;
        System.out.println(arr2); // null
        // NullPointerException: 空指针异常
        // System.out.println(arr2[1]);
        System.out.println(arr2.length);
    }
}
