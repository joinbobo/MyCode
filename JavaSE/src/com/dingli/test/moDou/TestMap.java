package com.dingli.test.moDou;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","12");
        map.put("sex","男");
        map.put("age","13");

        System.out.println(map.size());//长度为3 key值不可重复

        System.out.println(map.isEmpty());

        map.remove("age");
        System.out.println(map.size());

        Set keys = map.keySet();
        for(Object key : keys){
            System.out.println("key - " + key);
        }

        Collection values = map.values();
        for(Object value : values){
            System.out.println("values - " + value);
        }

        System.out.println("==============");
        for(Map.Entry<String, String> entry : map.entrySet()){  //此方法遍历更简便
            System.out.println("key：" + entry.getKey() + "  value:" + entry.getValue());
        }
    }
}
