package com.dingli.test.io;

public class Demo17 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Place pp1 = new Place ("四川省","成都市","龙泉驿");
        Person p1 = new Person("张三",22,pp1);
        System.out.println(p1);

        Person p2 = (Person)p1.clone();
        p2.getPlace().setCounty("成华区");
        System.out.println(p1);
    }
}
