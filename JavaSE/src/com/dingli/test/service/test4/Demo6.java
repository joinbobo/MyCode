package com.dingli.test.service.test4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

/**
 * 6.List集合反转
 */
public class Demo6 {
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

        System.out.println("反转前："+ list);
        System.out.println("======================");
        reverse(list); //集合元素反转
        System.out.println("反转后："+ list);

        /**
         * list常用操作：
         *      排序：Collections.sort();
         *      查找：Collections.binarySearch();
         *      打乱排序：Collections.shuffle();
         *      反转集合中元素的顺序：reverse();
         */
    }
}
