package com.zixue.test.test;

public class Demo5 {
    public static void main(String args[]) {
        byte b = 10;   // 二进制表示00001010
        //*********Found********** 5的二进制表示0101 相同为0，不同为1
        byte c = 0X00f; //15
        b = (byte)(b ^ c);
        //*********Found**********
        System.out.println("b的结果是："+b);

        int a = 2;
        System.out.println(~a); //取a二进制反
        // 输出~a=-3
    }
}
