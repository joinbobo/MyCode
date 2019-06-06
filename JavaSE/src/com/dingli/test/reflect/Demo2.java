package com.dingli.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.dingli.test.object.Student");

        Field[] fileds = clazz.getFields();
        /**
         *  getFields:打印出public的属性
         */
        for(Field f : fileds){
            System.out.println(f);//没有数据，因为所有的属性都是private
        }
        System.out.println("------------");
        Field[] fileds1 = clazz.getDeclaredFields();
        //getDeclaredFields:打印出所有属性，包括private
        for(Field f : fileds1){
            System.out.println(f);
        }
        System.out.println("------------");

        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
