package com.dingli.test.collection.test;

import com.dingli.test.collection.test.Person;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",18,1));
        list.add(new Person("李四",32,1));
        list.add(new Person("周吴",28,0));
        list.add(new Person("郑王",12,1));
        list.add(new Person("赵钱孙",54,0));
        System.out.println(list);

        // 获得周吴所在下标
        int index1 = list.indexOf(new Person("周吴",28,0));
        // 修改周吴的年龄
        list.get(index1).setAge(100);
        System.out.println("修改周吴的年龄:"+list);

        list.remove(new Person("李四",32,1));
        System.out.println("删除李四的信息:"+list);

        int index2 = list.indexOf(new Person("周吴",100,0));
        list.add(index2+1,new Person("周王",99,1));
        System.out.println("在周吴后加周王"+list);

        System.out.println("-------------");

        // 遍历list集合
        for(Person p : list){
            System.out.println(p);
        }

        System.out.println("--------------");

        // 用for循环遍历
        int size = list.size(); //返回list的元素个数
        for(int i = 0; i<size; i++){
            System.out.println(list.get(i));
        }

        System.out.println("------------");

        // 用迭代器遍历
        Iterator<Person> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("-----------");

        // 按年龄排序
        Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
        });
        for(Person e : list){
            System.out.println("按年龄排序"+e);
        }

    }
}

