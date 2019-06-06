package com.dingli.test.service.test4;

import java.util.*;

/**
 * 3.List、Set、HashMap集合遍历
 */
public class Demo3 {
    public static void main(String[] args) {
        /**
         * List集合遍历
         */
        System.out.println("List集合遍历：");
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");

        for(Object obj : list){
            System.out.println(obj);
        }

        /**
         * Set集合遍历
         */
        System.out.println("======这是一条分割线======");
        System.out.println("Set集合遍历：");
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王二");

        for(Object obj : set){
            System.out.println(obj);
        }

        /**
         * HashMap集合遍历
         */
        System.out.println("======这是一条分割线======");
        System.out.println("HashMap集合遍历：");
        Map<String, String> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","20");
        map.put("sex","男");

        Set keys = map.keySet();
        for(Object key : keys){
            System.out.println("key=>"+ key);
        }

        Collection values = map.values();
        for(Object value : values){
            System.out.println("value=>"+ value);
        }
    }
}
