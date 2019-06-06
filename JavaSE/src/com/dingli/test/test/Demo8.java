package com.dingli.test.test;

public class Demo8 {
    public static void main(String[] args){
        System.out.println("试用for循环，计算2+4+6+.....+n的总和。n=100");
        int n = 100;
        int num = 0;
        for (int i = 2; i <= n ; i += 2){
            num += i;
        }
        System.out.println(num);
    }

}
