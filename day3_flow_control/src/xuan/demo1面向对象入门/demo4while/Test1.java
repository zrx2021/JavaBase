package xuan.demo1面向对象入门.demo4while;

public class Test1 {
    public static void main(String[] args) {
        // 1.定义变量保存纸张的厚度
        // 2.定义变量表示珠穆朗玛峰的高度
        // 3.定义变量保存折叠的次数
        // 4.使用while, 纸张厚度 < 珠穆朗玛峰的高度, 折叠一次, 厚度*2, 次数+1
        int counter = 0;
        double paper = 0.1;
        while (paper < 8848860) {
            paper *= 2;
            counter++;
        }
        System.out.println("纸张厚度" + paper);
        System.out.println("需要折叠" + counter + "次");
    }
}
