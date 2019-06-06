package com.dingli.test.object;

import java.util.Arrays;
import java.util.Comparator;

public class CompareDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三",24,98);
        Student s2 = new Student("李四",23,68);
        Student s3 = new Student("王五",20,88);
        Student s4 = new Student("唐二",24,100);
        Student s5 = new Student("刘大",21,79);
        Student s6 = new Student("赵七",23,89);
        Student[] arr = {s1,s2,s3,s4,s5,s6};
        // 按照年龄从小到大排序
        // 数组工具类 Arrays
        int[] a = {9,4,10,33,55,2,5};
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i+"\t");
        }
        System.out.println();

        // 从大到小
        Integer[] b = {9,4,10,33,55,2,5};
        Arrays.sort(b,new Comparator<Integer>(){ // 此花括号就是匿名内部类的类体花括号
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        /**
         *  第二个参数：实际上是一个匿名内部类
         *  实际上第二个参数是，Comparator类的一个子类
         *  而且直接实例化
         */

        for(int i : b){
            System.out.print(i + "\t");
        }

        // 我们使用的sort方法为乏型方法
        // static <T> void sort(T[] a, Comparator<? super T> c)
        // T 表示通配符 表示任意的类型
        // 但是我们在调用的时候，传的参数是什么类型T就是什么类型
    }
}
