package xuan.demo1面向对象入门.homework;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] arr = {11, 33, 55, 44, 22, 88};
        System.out.println(isNumberExistInArray(arr, 22));
        System.out.println(isNumberExistInArray(arr, 99));
    }

    public static int isNumberExistInArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
