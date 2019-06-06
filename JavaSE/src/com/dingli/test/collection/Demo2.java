package com.dingli.test.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        //添加100个0-100范围的随机数到LinkedList
        for(int i=0;i<100;i++){
            int num = (int)(Math.random()*101);
            list.add(num);
        }
        Collections.sort(list); //排序
        System.out.println(list);

    }
}
