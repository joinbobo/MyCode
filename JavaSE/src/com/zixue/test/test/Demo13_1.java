package com.zixue.test.test;

public class Demo13_1 {
    void receive(int i) {
        System.out.println("Receive one int data");
        System.out.println("i=" + i);
    }

    //*********Found**********
    void receive(int x, int y) {
        System.out.println("Receive two int data");
        System.out.println("x=" + x + "  y =" + y);
    }
    //*********Found**********
    void receive(double d) {
        System.out.println("Receive one double data");
        System.out.println("d=" + d);
    }

    //*********Found**********
    void receive(String s) {
        System.out.println("Receive a string");
        System.out.println("s="+s);
    }
}
