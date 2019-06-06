package com.dingli.test.reflect;

import com.dingli.test.util.PropertiesUtil;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName(PropertiesUtil.getProperty("who"));
        Animal animal = (Animal)clazz.newInstance();

        animal.eat();
        animal.run();
    }
}
