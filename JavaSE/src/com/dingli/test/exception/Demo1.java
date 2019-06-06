package com.dingli.test.exception;

public class Demo1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try{
            System.out.println(x / y);
            System.out.println("看看是否执行");
        }catch (ArithmeticException e){
            //catch 块 用于捕获异常
            //当出现对应的异常时
            //try块中异常出现的地方之后的代码不会执行了
            //而执行对应catch块中的代码
            e.printStackTrace();    //打印异常栈
        }
        System.out.println("看看是否执行2");
    }
}
