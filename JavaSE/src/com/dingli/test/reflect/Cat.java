package com.dingli.test.reflect;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void run() {
        System.out.println("猫在跳");
    }
}
