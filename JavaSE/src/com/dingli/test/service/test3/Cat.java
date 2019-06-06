package com.dingli.test.service.test3;

public class Cat extends Animal {
    /**
     * 继承父类所有的抽象方法
     */
    @Override
    void cry() {
        System.out.println("猫叫：喵喵喵！");
    }
}
