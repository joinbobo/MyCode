package com.dingli.test.test;

public class Demo6 {
    public static void main(String[] args){
        System.out.println("实现两数的互换（要求：不能使用中间变量)");
        int a = 10;
        int b = 20;
        b = b - a ;
        a += b;
        System.out.print("a的值是："+a +"\n"+ "b的值是："+b);
    }

}
