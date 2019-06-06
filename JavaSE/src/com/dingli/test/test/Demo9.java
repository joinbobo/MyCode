package com.dingli.test.test;

public class Demo9 {
    public static void main(String[] args){
        System.out.println("2.求1-100的所有奇数和偶数并打印输出");
        int a = 0;
        int b = 0;
        for (int i = 1; i <=100 ; i++){
            if (i%2==0){
                a += 1;
            }else {
                b += 1;
            }
        }
        System.out.print("奇数的个数为："+a+"\n"+"偶数的个数为："+b);
    }

}
