package com.dingli.test.service.demoOverride.service.impl;


import com.dingli.test.service.demoOverride.service.AnimalService;

/**
 * 动物实现
 */
public class AnimalServiceImpl implements AnimalService {

    @Override
    public void eat() {
        System.out.println("动物吃东西");
    }

    @Override
    public void run() {
        System.out.println("动物跑步");
    }
}
