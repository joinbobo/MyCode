package com.dingli.test.exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        DateFormat df =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        try{
//            System.out.println(x / y);
//            df.parse("2018-10-30 23:25:18");
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }catch(ParseException e){
//            e.printStackTrace();
//        }
        /**
         * Exception 是所有异常的父类
         *  它兼容所有异常
         *
         *  之所有要分开catch，是因为不同的异常可能的处理代码不一样
         *  所以分开，而且建议是分开
         */

        // 上面代码的最终处理方式
        try{
            System.out.println(x / y);
            df.parse("2018-10-30 23:25:18");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        /**
         * 为什么要在最后加一个catch Exception？
         *
         * 我们try块中，可能出现的异常我们可能没有全部catch
         * 因为Exception兼容所有异常，所以在最后catch了Exception异常
         *
         * 为什么要在最后catch exception
         * catch Exception放前面，后面特定的异常catch将不能捕获特定的异常
         */

        /**
         *  以上代码用了两个catch
         *      1.两行语句都会出现异常
         *      2.两行语句的异常类型不一样
         *
         *  但是如果第一行语句出现异常，那么第二行语句不会执行
         */
    }
}
