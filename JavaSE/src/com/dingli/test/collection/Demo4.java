package com.dingli.test.collection;

import java.util.Set;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // TreeSet 有序的，不重复的 不能保存null
        set.add(3);
        set.add(6);
        for(int i =0;i<100;i++){
            int num = (int)(Math.random()*101);
            set.add(num);
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}
