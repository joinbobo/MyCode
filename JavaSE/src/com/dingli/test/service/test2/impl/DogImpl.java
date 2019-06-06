package com.dingli.test.service.test2.impl;

import com.dingli.test.service.test2.Dog;

public class DogImpl implements Dog {
    /**
     * 狗的实现类
     */
    @Override
    public void eat() {
        System.out.println("狗的食物：骨头");
    }

    @Override
    public void running() {
        System.out.println("狗的运动：跳门");
    }


}
