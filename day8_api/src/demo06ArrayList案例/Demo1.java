package demo06ArrayList案例;

import java.util.ArrayList;

/*
目标：掌握从集合容器中找数据并删除的技巧

    创建ArrayList集合,添加下列元素到集合中
        "Java入门"
        "宁夏枸杞"
        "黑枸杞"
        "人字拖"
        "特级枸杞"
        "枸杞子"

        删除带有枸杞的元素
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        System.out.println("list = " + list);

        // 删除带有枸杞的元素方式一：删除后i--
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.contains("枸杞")) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("list = " + list);

        // 添加元素
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        System.out.println("list = " + list);

        // 方式二：反过来遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            String name = list.get(i);
            if (name.contains("枸杞")) {
                list.remove(i);
            }
        }

        System.out.println("list = " + list);
    }
}
