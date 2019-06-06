package com.dingli.test.service.demoOverride.service.impl;


import com.dingli.test.service.demoOverride.service.HorseService;

/**
 * 马实现
 */
public class HorseServiceImpl extends AnimalServiceImpl implements HorseService {

    public void color(String leg) {
        System.out.println("这是马的" + leg);
    }

    public void color(String leg, int number) {
        System.out.println("这是马的" + leg + "有" + number + "腿");
    }

    //方法重写
    public void eat(){
        System.out.println("马吃草");
    }
}
