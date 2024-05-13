package com.itheima.test01;

/*
需求
定义一个女朋友类。女朋友的属性包含：姓名，身高，体重
定义测试类，请在测试类中通过无参构造创建对象，通过set方法给属性进行赋值。通过有参构造创建对象。最终，把两个对象的属性输出

程序执行，在控制台输出效果
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
我女朋友叫迪妮热巴,身高175.0厘米,体重90.0斤
 */
public class Test01 {
    public static void main(String[] args) {
        // 无参 + set
        GirlFriend g1 = new GirlFriend();
        g1.setName("凤姐");
        g1.setHeight(155.0);
        g1.setWeight(130.0);
        // System.out.println("我的女朋友叫" + g1.getName() + ",身高" + g1.getHeight() + "厘米，体重" + g1.getWeight() + "斤");
        g1.show();

        // 满参
        GirlFriend g2 = new GirlFriend("迪丽热巴", 175.0, 90);
        // System.out.println("我的女朋友叫" + g2.getName() + ",身高" + g2.getHeight() + "厘米，体重" + g2.getWeight() + "斤");
        g2.show();
    }
}
