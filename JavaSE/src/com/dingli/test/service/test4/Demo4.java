package com.dingli.test.service.test4;

import java.util.*;

/**
 * 4.List、Set、Map集合长度
 */
public class Demo4 {
    public static void main(String[] args) {
        /**
         * List集合长度
         */
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("王二");
        list.add("");

        System.out.println("List集合长度："+ list.size()); //长度为5 可重复 允许null 有序


        /**
         * Set集合长度
         */
        System.out.println("======这是一条分割线======");
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王二");
        set.add("王二");
        set.add("");
        set.add("");

        System.out.println("Set集合长度："+ set.size()); //长度为4 不允许重复 无序 允许null(只允许一个)

        /**
         * HashMap集合长度
         */
        System.out.println("======这是一条分割线======");
        Map<String,String> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","20");
        map.put("sex","男");
        map.put("sex","女");
        map.put("gender","男");
        map.put("hobby","");
        map.put("","");

        System.out.println("HashMap集合长度："+ map.size()); //长度为6 key值不可重复 key值和value值允许为null

    }
}
