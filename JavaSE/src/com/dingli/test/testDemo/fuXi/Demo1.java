package com.dingli.test.testDemo.fuXi;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //String类
        char[] value = new char[]{'s','a','d'};
        String s2 = new String(value,1,2);
        System.out.println(s2);

        StringBuffer sm = new StringBuffer();
        sm.append("122");   //append 附加，增补
        sm.append(true);
        sm.append("哈哈");
        System.out.println(sm);

        Random ra = new Random();
        String[] str = {"红桃1","红桃2","红桃3","红桃4","红桃5","红桃6"};
        for(int i=0; i<5; i++){
            int m = ra.nextInt(6); //bound 边界
            System.out.println(str[m]);
        }

        Date date = new Date();
        System.out.println("当前时间:"+date);

        Calendar c = Calendar.getInstance();
        System.out.println("现在是："+c.get(Calendar.YEAR)+"年"
        +(c.get(Calendar.MONTH)+1)+"月"
        +c.get(Calendar.DAY_OF_MONTH)+"日"
        +c.get(Calendar.HOUR_OF_DAY)+"时"
        +c.get(Calendar.MINUTE)+"分"
        +c.get(Calendar.SECOND)+"秒");

        final char[] week = {'日','一','二','三','四','五','六'};
        int week_num = c.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是星期"+week[week_num]);

    }
}
