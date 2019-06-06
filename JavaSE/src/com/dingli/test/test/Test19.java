package com.dingli.test.test;

public class Test19 {
    public static void main(String[] args) {
        int n = 5;
        printAsc(n);
        printDesc(n);
    }

    // 打印正三角
    public static void printAsc(int n){

        for(int i = 1; i <= n; i++){    // i 表示行数
            for(int j = 1; j <= n - i; j++){    //表示打印多少个空格
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){ //表示打印多少个
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 打印倒三角
    public static void printDesc(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(n - i) + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

