package com.dingli.test.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
        PP p1 = new PP("代阳",19);
        PP p2 = new PP("张三",14);
        PP p3 = new PP("李四",18);
        PP p4 = new PP("王二",11);
        PP p5 = new PP("二狗蛋",12);
        PP p6 = new PP("二狗蛋",12);

        // 添加TreeSet集合中的对象必须是可比较的
        Set<PP> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        // set遍历
        //  1.set不能使用for循环遍历
        //  2.使用foreach遍历
        //  3.使用迭代器迭代
        for(PP p : set){
            System.out.println(p);
        }

        System.out.println("-----------------");

        Iterator<PP> iter = set.iterator(); //创建迭代器
        while(iter.hasNext()){  //判断是否有下一个元素
            System.out.println(iter.next());
        }
    }
}
