package com.zixue.test.test;

public class Demo13{
    public static void main(String args[]) {
        Demo13_1 mo = new Demo13_1();
        mo.receive(1);
        mo.receive(2, 3);
        mo.receive(12.56);
        mo.receive("very interesting, is not it?");
    }
}
