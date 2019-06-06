package com.dingli.test.object;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        // 一般遇到这种不能直接 new 的类
        //它一般都会提供一个 newInstance 的类方法来实例化
        System.out.println(c);
        // 初始化后的时间就是当前时间

        // 设置特定时间： 2018/10/1 00:00:00
        c.set(2018,10,1,0,0,0);
        // 月份范围 0-11
        Date date = c.getTime();    // Calendadat 的getTime方法返回Date类型
        System.out.println(date);

        // 自定义时间
        c.set(Calendar.HOUR_OF_DAY, 17);    // 设置24小时制小时
        c.set(Calendar.MINUTE, 59); // 设置分钟
        c.set(Calendar.SECOND, 59); // 设置秒
        System.out.println(c.getTime());

        Date ddd = new Date();

        Calendar cc = Calendar.getInstance();
        cc.setTime(ddd);    // 用java.util.Date 对象设置Calendar时间


    }
}
