package com.dingli.test.test;

public class Demo4 {
    public static void main(String[] args){
        System.out.println("判断101-200之间有多少个素数，并输出所有素数");
        for (int i = 101 ; i <= 200;i++){
            if (i % i ==0){
                System.out.print(i + "\t");
            }else{
                System.out.print(" ");
            }
        }
    }

}
