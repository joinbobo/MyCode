package com.dingli.test.test;

public class Demo5 {
    public static void main(String[] args){
        System.out.println("用while语句完成第二题");
        int i = 1;
        int sum = 0;
        while(i <= 100){

            sum += i;
            i++;
        }
        System.out.print(sum);
    }

}
