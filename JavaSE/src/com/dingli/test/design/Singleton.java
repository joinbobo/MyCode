package com.dingli.test.design;


/**
 *  单例模式；
 *      1.私有化所有构造方法
 *      2.定义自身类型的成员变量
 *      3.定义获取实例化对象成员变量的静态方法
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){ }

    public static final Singleton newInstance(){

        return singleton;
    }
}
