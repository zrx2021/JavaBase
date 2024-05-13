package xuan.demo1面向对象入门.demo1;

/*
目标：完成数字加密程序的开发

某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是：对密码中的每位数，都加5,
再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序！
*/
public class Demo4 {
    public static void main(String[] args) {
        String Str = encrypt(1983);
        System.out.println("加密后" + Str);
        String Str2 = encrypt(8346);
        System.out.println("解密后" + Str2);
    }

    /**
     * 对4位数进行加密
     *
     * @param number 需要加密的数字
     * @return 加密后的数字
     */
    public static String encrypt(int number) {
        int[] arr = new int[4];
        arr[0] = number / 1000;
        arr[1] = number / 100 % 10;
        arr[2] = number / 10 % 10;
        arr[3] = number % 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        return str;
    }
}
