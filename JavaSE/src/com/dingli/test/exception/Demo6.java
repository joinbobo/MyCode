package com.dingli.test.exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo6 {
    public static void main(String[] args) {
        try {
            parseDate("");
        } catch (ParseException e) {
            System.out.println("你输入的日期格式不对");
            e.printStackTrace();
        }
    }
    public static Date parseDate(String dateStr) throws ParseException{


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return df.parse(dateStr);

    }
    /**
     *  throws 关键字：
     *      用于处理异常，处理方式为在方法上抛出对应的异常类
     *      表示该异常，由调用该方法的地方出处理
     *
     *      调用该方法的地方，也有两种方式处理
     *          1.throws
     *          2.try...catch...
     */
}
