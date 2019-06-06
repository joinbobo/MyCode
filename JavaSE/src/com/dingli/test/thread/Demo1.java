package com.dingli.test.thread;

//用继承Thread类的方法来实现多线程
//  1.继承Thread类
//  2.重写run方法
public class Demo1 extends Thread{
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1();
        d.start();  //调用start方法表示启动线程
        d1.start();



//        d.run();
//        d1.run();
        /**
         *  直接调用run方法，不是多线程的执行
         *  跟我们一起的方法调用没有什么两样
         *  先调用的先执行，后调用的后执行
         */

        /**
         * 调用start方法才是多线程的执行
         * 表示当前线程可以执行（但不一定马上执行）
         * 需要获得CPU资源才会执行
         *
         * 什么时候获得CPU资源呢？  随缘！ -- 实际上可以稍微控制
         */
    }
    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
