package xuan.demo1.test3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher t1 = new Teacher("张三", '男', 20);
        Teacher t2 = new Teacher("李四", '男', 21);
        Teacher t3 = new Teacher("王五", '女', 22);
        Teacher t4 = new Teacher("赵六", '男', 30);
        Teacher t5 = new Teacher("魏七", '女', 31);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);

        ArrayList<Teacher> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            if (t.getAge() < 30 && t.getGender() == '男') {
                list2.add(t);
            }
        }

        int totalAge = 0;
        int maxAge = list2.get(0).getAge();
        int minAge = list2.get(0).getAge();
        for (int i = 0; i < list2.size(); i++) {
            Teacher t = list2.get(i);
            int age = t.getAge();
            if (maxAge < age) {
                maxAge = age;
            }
            if (minAge > age) {
                minAge = age;
            }
            totalAge += age;
        }
        System.out.println("总年龄是：" + totalAge);
        System.out.println("最大年龄是：" + maxAge);
        System.out.println("最小年龄是：" + minAge);
        System.out.println("平均年龄是：" + totalAge * 1.0 / list2.size());
    }
}
