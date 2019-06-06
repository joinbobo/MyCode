package com.dingli.test.moDou;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        for(Object obj : list){
            System.out.println(obj);
        }


        System.out.println(list.size());//数组长度

        System.out.println(list.isEmpty());//判断是否为空

        System.out.println(list.get(0));//查询下标为 0 的数组

        list.remove(1);//删除下标为 1 的数组
        System.out.println(list.size());
    }
}
