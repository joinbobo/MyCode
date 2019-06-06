package com.dingli.test.moDou;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王二");

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        for(Object obj : set){
            System.out.println(obj);
        }
    }
}
