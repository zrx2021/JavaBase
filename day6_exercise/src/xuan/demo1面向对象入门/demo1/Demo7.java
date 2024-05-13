package xuan.demo1面向对象入门.demo1;

public class Demo7 {
    public static void main(String[] args) {
        int count = findPrime(101, 200);
        System.out.print("count = " + count + " ");
    }

    public static int findPrime(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            boolean isPrime = true;// 假设是素数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}
