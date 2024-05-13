package homework8;

import java.util.ArrayList;

public class HomeWork8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it001", "孙红雷", 1.78);
        Student s3 = new Student("it001", "章子怡", 1.64);
        Student s4 = new Student("it001", "杨颖", 1.68);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("ID：" + s.getId() + " Name：" + s.getName() + " Height：" + s.getHeight());
        }

        System.out.println("集合大小是：" + list.size());

        Student stu = list.get(2);
        System.out.println("ID：" + stu.getId() + " Name：" + stu.getName() + " Height：" + stu.getHeight());

        list.remove(3);

        System.out.println("集合大小是：" + list.size());

        Student newStu = new Student("it005", "撒贝宁", 1.67);
        list.set(0, newStu);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getHeight() > 1.70) {
                System.out.println("ID：" + s.getId() + " Name：" + s.getName() + " Height：" + s.getHeight());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getName().startsWith("孙")) {
                System.out.println("ID：" + s.getId() + " Name：" + s.getName() + " Height：" + s.getHeight());
            }
        }
    }
}
