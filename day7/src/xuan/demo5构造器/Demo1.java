package xuan.demo5构造器;

public class Demo1 {
    public static void main(String[] args) {
        // 1. 使用无参构造器创建对象
        Student s1 = new Student();
        s1.name = "李思思";
        s1.score = 99;
        s1.show();

        System.out.println("----------------------");

        Student s2 = new Student("汪呜呜", 88);
        s2.show();
    }
}
