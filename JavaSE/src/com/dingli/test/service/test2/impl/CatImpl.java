package com.dingli.test.service.test2.impl;


import com.dingli.test.service.test2.Cat;

public class CatImpl implements Cat {
    /**
     * 猫的实现类
     */
    @Override
    public void eat() {
        System.out.println("猫的食物：鱼");
    }

    @Override
    public void running() {
        System.out.println("猫的运动：抓老鼠");
    }


}
