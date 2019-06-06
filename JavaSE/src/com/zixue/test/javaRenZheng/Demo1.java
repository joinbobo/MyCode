package com.zixue.test.javaRenZheng;

public class Demo1 {
    public static void main(String[] args) {
        int x = 2;
        Demo1 d = new Demo1();
        d.go(x);
    }
    static{
        x += x;
    }

    void go(int x){
        ++x;
        System.out.println(x);
    }
}
