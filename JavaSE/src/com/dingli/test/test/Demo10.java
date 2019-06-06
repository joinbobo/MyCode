package com.dingli.test.test;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("打印输出0-600能被7整除但不能被4整除的所有整数，要求每行显示6个数据");
        int a = 0;
        for (int i = 0; i < 601; i++) {
            if (i % 7 ==0 && i % 4 != 0){
                System.out.print(i+"\t");
                a++;
            }
            if (a == 6){
                System.out.println("");
                a = 0 ;
            }
        }
    }

}
