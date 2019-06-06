package com.dingli.test.exception;

public class Demo4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        try{
            System.out.println(x / y);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{   //无论是否出现异常，该块都会执行
            System.out.println("看看是否执行");
        }

    }
}
