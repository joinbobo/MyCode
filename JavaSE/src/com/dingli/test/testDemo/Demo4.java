package com.dingli.test.testDemo;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // 4.	计算n的阶乘。
        System.out.println("计算n的阶乘");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        System.out.println(n + "的阶乘为" + f(n));
    }
    public static int f(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num *= i;
        }
        return num;
    }
}
