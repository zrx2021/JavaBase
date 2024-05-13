package demo03String常用方法;

public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("itheima");
        String s2 = new String("itheima");

        System.out.println(s1 == s2);// false

        System.out.println(s1.equals(s2));// true

        String s3 = new String("ITheima");
        System.out.println(s1.equals(s3));// false

        System.out.println(s1.equalsIgnoreCase(s3));// true
    }
}
