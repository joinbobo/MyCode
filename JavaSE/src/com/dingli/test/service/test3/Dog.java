package com.dingli.test.service.test3;

public class Dog extends Animal {
    /**
     * 继承父类所有的抽象方法
     */
    @Override
    void cry() {
        System.out.println("狗叫：汪汪汪！");
    }
}
