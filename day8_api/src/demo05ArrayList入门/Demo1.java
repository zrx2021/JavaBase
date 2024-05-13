package demo05ArrayList入门;

import java.util.ArrayList;

/*
目标：掌握创建ArrayList集合的对象，并熟悉ArrayList提供的常用方法
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.创建一个ArrayList的集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.往集合添加元素到最后: public boolean add(E e)
        list.add("AAA");
        list.add("BBB");
        list.add("DDD");
        list.add("EEE");
        System.out.println("add往后添加元素list = " + list);// [AAA, BBB, DDD, EEE]
        //                                               索引  0     1    2    3

        //3.往集合中的某个索引位置处添加一个数据: public void add(int index,E element)
        list.add(2, "CCC");
        System.out.println("add往2索引位置添加元素list = " + list);// [AAA, BBB, CCC, DDD, EEE]
        //                                                  索引     0     1   2    3    4

        //4.根据索引获取集合中某个索引位置处的值: public E get(int index)    相当于 数组名[索引]
        System.out.println(list.get(2));// CCC
        System.out.println(list.get(3));// DDD

        //5.获取集合的大小（返回集合中存储的元素个数）: public int size()       相当于 数组名.length
        System.out.println("集合大小" + list.size());// 5

        //6.修改某个索引位置处的数据: public E set(int index,E element)     相当于 数组名[索引] = 新的值
        list.set(1, "BAD");
        System.out.println("set修改后：list = " + list);// [AAA, BAD, CCC, DDD, EEE]

        //7.根据索引删除集合中的某个元素值: public E remove(int index)
        list.remove(3);
        System.out.println("remove根据索引删除后list = " + list);// [AAA, BAD, CCC, EEE]

        //8.直接元素删除某个元素: public boolean remove(Object o)
        list.add(3, "DDD");
        list.add("DDD");
        System.out.println("删除前添加重复元素list = " + list);// [AAA, BAD, CCC, DDD, EEE, DDD]
        // 如果有多个只会删除第一个
        list.remove("DDD");
        System.out.println("根据元素删除DDD结果：" + list);// [AAA, BAD, CCC, EEE, DDD]
    }
}
