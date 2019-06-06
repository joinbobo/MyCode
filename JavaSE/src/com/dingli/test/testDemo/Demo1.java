package com.dingli.test.testDemo;

public class Demo1 {
    public static void main(String[] args) {
        // 1.	打印输出0-600能被7整除但不能被4整除的所有整数，要求每行显示6个数据。
        int num = 0;
        for(int i=0; i<=600; i++){
            if(i%7==0 && i%4 != 0){
                System.out.print(i + " ");
                num++;
                if(num % 6 == 0){
                    System.out.println();
                }
            }
        }
    }
}
