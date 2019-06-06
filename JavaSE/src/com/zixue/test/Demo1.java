package com.zixue.test;

public class Demo1 extends Thread{
    // 多线程
    public static void main(String[] args) {
        Demo1 test = new Demo1();
        test.start();

    }
    private int count = 10;
    public void run(){
        while(true){
            System.out.println(count+" ");
            if(--count == 0){
                break;
            }
        }
    }
}
