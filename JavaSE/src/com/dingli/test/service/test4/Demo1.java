package com.dingli.test.service.test4;

import java.util.Arrays;
import java.util.List;

/**
 * 1.数组转List集合
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] array = new String[]{"张三","李四","王二"};
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("=========我是分割线==========");
        List<String> list = Arrays.asList(array);   //**** asList 方法完成数组转换List集合
        for(int i = 0; i<list.size(); i++){
            System.out.println("list=>" + list.get(i));
        }


    }
}
