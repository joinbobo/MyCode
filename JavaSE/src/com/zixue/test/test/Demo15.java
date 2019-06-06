package com.zixue.test.test;

public class Demo15 {
    public static void main(String[] args) {
        int a,x = 2008;
        //*********Found**********
        System.out.print(  x + "->" );
        while( x != 0 ){
            //*********Found**********
            a = x%10; //a=8 0 0
            System.out.print(a);
            //*********Found**********
            x = x/10; //x=200 20 2
        }
    }
}
