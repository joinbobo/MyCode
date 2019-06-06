package com.dingli.test;

public class Test4 {
    public static void main(String[] args){
        int a = 10;
        for(int i = 0; ++a <20 && a++ <20;i++){
            System.out.println(++a);
        }
        System.out.println(a);

        int b = 10;
        System.out.println(b++);
    }
}
