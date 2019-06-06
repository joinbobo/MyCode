package com.dingli.test.io;

import com.dingli.test.object.Student;

public class Demo16 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("张三",22,100);
        Student s2 = (Student)s1.clone();    // 把s1的地址赋值给s2
        s2.setName("李四");
        System.out.println(s1);
    }
}
