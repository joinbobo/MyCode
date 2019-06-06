package com.dingli.test.service.demoOverride;


import com.dingli.test.service.demoOverride.service.impl.HorseServiceImpl;
import com.dingli.test.service.demoOverride.service.impl.TigerServiceImpl;

public class Test {

    public static void main(String[] args) {
        TigerServiceImpl tigerService = new TigerServiceImpl();
        tigerService.eat();
        tigerService.run();
        tigerService.family("爸爸","儿子");

        HorseServiceImpl horseService = new HorseServiceImpl();
        horseService.eat();
        horseService.run();

        // TODO 1、需要分别重写马和老虎吃的方法，并打印出马吃草、老虎吃肉

        // TODO 2、需要重载老虎的family方法，返回爸爸和儿子的名字
    }
}
