package com.dingli.test.object;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDemo {
    /**
     *  java 中的格式化类
     *
     *  java.text.Format 类的子类
     *      字符串格式类：MessageFormat
     *      数字格式化类：NumberFormat
     *      日期格式化类：DateFormat
     */
    public static void main(String[] args){
        // 字符串格式类
        String str = MessageFormat.format("您好,{0},今天是{1}","余京","2018年11月1日");
        System.out.println(str);

        // 数字格式化类用 NumberFormat 的子类 DecimalFormat
        DecimalFormat df = new DecimalFormat("\u00A40.00");
        String s1 = df.format(12.80);
        System.out.println(s1);

        DecimalFormat df2 = new DecimalFormat("\u00A4#.##");
        String s2 = df2.format(12.80);
        System.out.println(s2);
        // 0和#的区别
        // 后面几个0，得到的结果就保留几位小数
        // #表示有效数字  后面的0不显示

        // 显示价格的最终格式(加上千分符)
        DecimalFormat df3 = new DecimalFormat("\u00A4#,###,##0.00");
        String s3 = df3.format(12222.80);
        System.out.println(s3);

        // 日期格式化：使用的是 DateFormal 的子类 SimpleDateFormat
        String gs = "yyyy年MM月dd日 HH:mm:ss.SSS";   //yyyy年MM月dd日 HH:mm:ss.SSS E
        SimpleDateFormat sd = new SimpleDateFormat(gs);
        Date date = new Date();
        System.out.println(sd.format(date));

        // parse 方法：根据指定格式的字符串，转换为Date对象
        // 如果参数格式和定义的格式不一样，会报异常
//        Date d = sd.parse("2010年11月02日 12:58:35.888");
//        System.out.println(d);

    }
}
