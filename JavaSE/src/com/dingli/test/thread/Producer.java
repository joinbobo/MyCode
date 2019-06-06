package com.dingli.test.thread;


import java.util.List;

// 生产者
public class Producer implements Runnable{
    //表示已经生产的产品
    private List<Integer> list;
    private int max;



    public Producer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while(true){
            int size = list.size();

            if(size == this.max){
                System.out.println("货源充足，不用生产!");
            }else{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(1);
            }

        }

    }
}
