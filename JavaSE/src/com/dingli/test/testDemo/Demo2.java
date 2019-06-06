package com.dingli.test.testDemo;

public class Demo2 {
    public static void main(String[] args) {
        // 2.	求1-100的所有奇数和偶数并打印输出
        System.out.println("奇数：");
        for(int i=1; i<=100; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n偶数：");
        for(int i=1; i<=100; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
