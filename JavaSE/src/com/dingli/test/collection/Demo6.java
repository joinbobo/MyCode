package com.dingli.test.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // map是 k-v 键值对
        // k 是字符串类型，v 是整型

        // 向map对象中添加数据
        // 注意：数据对应的类型
        map.put("张三",10);
        map.put("李四",12);
        map.put("王五",15);
        map.put("张三",9);
        // map中key是通过set来实现的
        // HashMap的key就是用HashSet实现的
        // value的值通过collection实现的

        System.out.println(map);
        System.out.println(map.get("王五"));
        // map的遍历
        // 打印出map所有value值
        Collection<Integer> coll = map.values();
        // values 方法返回的是collection集合
        System.out.println(coll);

        // 打印所有的key值
        Set<String> keySet = map.keySet();
        // keySet方法返回的是key值得Set集合
        System.out.println("key的集合："+keySet);

        // 使用以上方法，以json对象的方式打印出map
        for(String key : keySet){
            System.out.println(key+"："+map.get(key));
        }

        System.out.println("------------------");
        // 迭代器遍历
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+"："+entry.getValue());
        }

    }
}
