package com.dingli.test.test;

import java.util.Scanner;

public class Demo7 {
    public static void  main(String[] args){
        System.out.println("计算n的阶乘");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字");
        int n = sc.nextInt();
        System.out.println("结果是："+f(n));
    }
    public static int f(int n){
        int sum = 1;
        for(int i = 1;i <= n;++i){
            sum *= i;
        }
        return sum;
    }

}
