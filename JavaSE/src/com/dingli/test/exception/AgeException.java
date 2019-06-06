package com.dingli.test.exception;


/**
 *  自定义异常
 *      1.类名要以Exception结尾
 *      2.继承Exception或Exception的子类
 *      3.参考Exception异常类定义构造函数
 */
public class AgeException extends Exception{

    // 一般定义的构造函数，一定包含异常信息

    public AgeException(String message) {
        super(message);
    }
}
