package com.zixue.test.test;

public class Demo22 extends TT{
    //*********Found**********
    public static void main(String args[]) {
        Demo22 t = new Demo22("小龙");
    }
    public Demo22(String s) {
        super(s);
        System.out.println("您好吗？");
    }
    public Demo22(){
        this("我是文朋");
    }
}
class TT {
    public TT() {
        System.out.println("多高兴啊!");
    }
    public TT(String s) {
        //*********Found**********
        this();
        System.out.println("我是"+s);
    }
}
