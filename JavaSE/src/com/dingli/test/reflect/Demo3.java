package com.dingli.test.reflect;

import com.dingli.test.object.Student;

import java.lang.reflect.Constructor;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.dingli.test.object.Student");

        // 使用反射实体化对象
        Student s = (Student)clazz.newInstance();
        // 等价于 Student s = new Student();
        System.out.println(s);

        System.out.println("--------------------");
        Constructor constructor = clazz.getConstructor(String.class,int.class,double.class);
        Student s1 = (Student)constructor.newInstance("张三",22,100);
        System.out.println(s1);
    }
}
