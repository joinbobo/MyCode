package com.dingli.test.thread;

import java.util.List;

public class Customer implements Runnable {
    private List<Integer> list;

    public Customer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int size = list.size();
        if(size == 0){
            System.out.println("没有产品 了，等待生产");
        }else{
            System.out.println(list.remove(0));
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
