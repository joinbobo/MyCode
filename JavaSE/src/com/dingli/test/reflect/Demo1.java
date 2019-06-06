package com.dingli.test.reflect;

import com.dingli.test.object.Student;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //3种方式获得Class对象
        // 1
        Class clazz1 = Student.class;
        // 2
        Student s = new Student();
        Class clazz2 = s.getClass();
        // 3
        Class clazz3 = Class.forName("com.dingli.test.object.Student");

    }
}
