package com.dingli.test.reflect;

public class Person implements Animal {
    @Override
    public void eat() {
        System.out.println("人在吃饭");
    }

    @Override
    public void run() {
        System.out.println("人在走路");
    }
}
