package com.dingli.test.object;

import java.util.Calendar;
import java.util.Date;

/**
 * import 用于导入我们代码中使用到的类
 * java.lang 包下的类，不用import
 * 我们自定义的类，在同一个包中，另外的类中使用，也可以不用import
 * 除 java.lang 包下的类，其余包下的类，要使用，都必须import
 *
 */
public class DateDemo {
    // 日期类
    /**
     * java.util.Date;  最常用的Date类型
     * java.sql.Date;   为了跟某些数据库对应的Date类型
     * java.util.Calendar;  做日期计算的，加减时间
     */
    public static void main(String[] args){
        // 用毫秒数初始化Date对象，正数表示1970年后的毫秒数
        Date date = new Date();
        // 直接new Date() 得到的是系统当前的时间
        System.out.println(date);
        System.out.println(date.getTime());
        // getTime 返回当前对象，到1970年的毫秒数

        // 用负数表示1970年之前的毫秒数
        Date date2 = new Date(-1000000000);
        System.out.println(date2);
        System.out.println(date2.getTime());
    }
}
