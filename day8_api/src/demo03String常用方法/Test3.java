package demo03String常用方法;

public class Test3 {
    public static void main(String[] args) {
        String telephone = "13912345678";

        // 139
        String first = telephone.substring(0, 3);//包头不包尾

        // 5678
        String end = telephone.substring(7);

        String newTelephone = first + "****" + end;

        System.out.println("脱敏后的手机号：" + newTelephone);
    }
}
