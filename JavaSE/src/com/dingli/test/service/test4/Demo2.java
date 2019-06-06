package com.dingli.test.service.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.List集合转数组
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        for(Object obj : list){
            System.out.println(obj);
        }

        System.out.println("========我是一条有感情的线条========");
        String[] array  = list.toArray(new String[0]); //*** toArray 方法完成list集合转换数组
        for(int i=0; i<array.length; i++){
            System.out.println("array=>" + array[i]);
        }

    }
}
