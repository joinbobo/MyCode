package com.dingli.test.service.test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 5.List集合打乱顺序
 */
public class Demo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");
        list.add("张三5");
        list.add("张三6");
        list.add("张三7");
        list.add("张三8");
        list.add("张三9");
        list.add("张三10");

        System.out.println("List集合打乱前："+ list);

        Collections.shuffle(list);//打乱排序
        System.out.println("List集合打乱后："+ list);
    }
}
