package com.dingli.test.collection;

import com.dingli.test.object.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        // 定义一个Integer类型的集合
        int[] a = new int[10];
        List<Integer> list = new ArrayList<Integer>();

        //添加 1-100的数在list中

        for(int i=1;i<=100;i++){
            list.add(i);
        }
        System.out.println(list);


        List<Student> list1 = new ArrayList<>();

        // add方法式泛型方法，参数的类型和List的泛型一致
        list1.add(new Student("张三",23,100));
        list1.add(new Student("李四",24,30));
        list1.add(new Student("王五",22,60));
        list1.add(new Student("唐二",20,50));
        list1.add(new Student("赵七",21,89));

        // 第一个参数表示添加到的位置
        // 第二个参数表示添加的元素
        // 以前该位置的元素依次往后移一位
        list1.add(2,new Student("余京",22,100));
        list1.remove(0);    //删除指定位置元素

        list1.remove(new Student("赵七",21,89));
        // 直接删除对应的对象（前提：对象对应的类需要重新hashCode和dquals方法）

        list1.set(0,new Student("李四一",24,30));
        System.out.println(list1);

        System.out.println(list1.contains(new Student("赵七",21,89)));
    }
}
