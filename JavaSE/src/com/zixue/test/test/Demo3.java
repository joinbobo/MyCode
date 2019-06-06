package com.zixue.test.test;

public class Demo3 implements Runnable{
    private int x=0;
    private int y=0;

    public static void main(String[]args){
        Demo3 r = new Demo3();
        //*********Found**********
        Thread t = new Thread( r );
        t.start();
    }
    public void run() {
        //*********Found**********
        int k = 0;
        for(;;){
            x++;
            //*********Found**********
            y++;
            k++;
            if (k>5) break;
            System.out.println("x=" + x + ",y ="+ y);
        }
    }
}
