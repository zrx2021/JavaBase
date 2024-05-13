package xuan.demo1面向对象入门.demo6方法参数传递;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = null;
        int[] arr4 = {};
        int[] arr5 = null;
        int[] arr6 = {30, 20, 10};
        int[] arr7 = {10, 20, 30};
        System.out.println(isSame(arr3, arr5));
        System.out.println(isSame(arr3, arr1));
        System.out.println(isSame(arr1, arr2));
        System.out.println(isSame(arr1, arr6));
        System.out.println(isSame(arr1, arr7));
    }

    public static boolean isSame(int[] a, int[] b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
