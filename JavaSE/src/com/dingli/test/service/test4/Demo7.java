package com.dingli.test.service.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * 7.删除List集合中指定元素
 */
public class Demo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("唐五");

        list.remove(2); //删除下标为2的元素
        System.out.println(list);
    }
}
