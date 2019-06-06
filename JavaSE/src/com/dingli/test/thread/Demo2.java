package com.dingli.test.thread;

public class Demo2 implements Runnable{
    public static void main(String[] args) {
        // 用Runnable接口实现多线程的调用方式
        Demo2 d = new Demo2();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for(int i = 0;i <=  100; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
