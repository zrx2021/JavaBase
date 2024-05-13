package xuan.demo6封装;

/*
目标：学习封装
封装原则：合理隐藏，合理暴露
1. 给成员变量添加private（私有，只有本类能够使用）
2. 编写public的get（获取）/set（修改）方法
 */
public class Demo1 {
    public static void main(String[] args) {
        // 1.使用无参构造创建对象
        Student s1 = new Student();
        // s1.name = "李思思";
        // s1.score = -1; // 变量直接赋值不安全
        s1.setName("李思思");
        s1.setScore(-1);
        System.out.println(s1.getName() + ":" + s1.getScore());
    }
}
