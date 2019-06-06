package com.dingli.test.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // parse 方法抛出异常 ParseException
        // 而且 ParseException 是非运行时异常
        // Demo1 中除数为0 的异常时运行时异常
        /**
         * 运行时异常：在编译的时候不会报错，在运行时才报错
         * 非运行时异常：在编译的时候就报错
         * 运行时异常可以处理，可以不处理
         * 非运行时异常，必须处理
         *
         * 怎么处理呢？
         *      1.try....catch...直接处理
         *      2.throws 关键字处理
         */
        try {
            Date d = sdf.parse("2018-10-30 12:59:59");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
