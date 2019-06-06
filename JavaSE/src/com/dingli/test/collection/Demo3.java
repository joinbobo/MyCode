package com.dingli.test.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  // HashSet无序的，不重复的 能保存null
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("唐二");
        set.add("李四");//不可重复
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
