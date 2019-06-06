package com.dingli.test.testDemo.fuXi;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        //集合
        //数组下标有问题

        //List：有序，可以重复
        List<P> list = new ArrayList<>();
        list.add(new P("皮卡丘",20,1));
        list.add(new P("王宝强",33,1));
        list.add(new P("杨幂",18,0));
        System.out.println(list);

        //获取杨幂下标
        int index1 = list.indexOf(new P("杨幂",18,0));
        //修改年龄
        System.out.println(index1);
//        list.get(index1).setAge(30);

        //迭代器遍历
        Iterator<P> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
