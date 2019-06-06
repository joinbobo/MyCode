package com.dingli.test.service.demoOverride.service.impl;


import com.dingli.test.service.demoOverride.service.TigerService;

/**
 * 老虎实现
 */
public class TigerServiceImpl extends AnimalServiceImpl implements TigerService {

    public void family(String mother) {
        System.out.println("老虎妈妈叫" + mother);
    }

    //方法重写
    public void eat(){
        System.out.println("老虎吃肉");
    }

    //方法重载
    public void family(String father,String son){
        System.out.println("爸爸的名字：" + father + "\n" + "儿子的名字：" + son);
    }
}
