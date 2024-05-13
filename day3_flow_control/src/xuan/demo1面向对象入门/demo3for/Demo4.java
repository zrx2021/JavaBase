package xuan.demo1面向对象入门.demo3for;

public class Demo4 {
    public static void main(String[] args) {
        // 嵌套循环流程：外循环执行一次，内循环执行所有
        for (int i = 0; i < 3; i++) { // 外循环
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) { // 内循环
                System.out.println("\tj = " + j);
            }
        }
        for (int i = 0; i < 4; i++) { // 外循环控制行数
            // 先打印5颗*，再换行
            // System.out.println("*****");
            // 使用循环先打五颗*
            for (int j = 0; j < 5; j++) { // 内循环控制列数
                System.out.print("*");
            }
            // 再换行
            System.out.println();
        }
    }
}
