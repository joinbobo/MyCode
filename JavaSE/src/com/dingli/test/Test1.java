package com.dingli.test;

public class Test1 {
    public static void main(String[] args){

        /**
         *   修饰符    类   包   子类    其他包
         *   public
         *   default
         *   protecd
         *   private
         *
         *   GC 垃圾回收机制
         *
         *    当多个线程操作一个数据的时候，会超出我们的程序判断的范围
         *    synchronized  同步方法
         *    synchronized(new Objext()){} 同步代码块
         */
        int ctrl=0;
        for(int i=1;i<=600;i++){
            if(i%7==0 & i%4!=0){
                System.out.print("\t"+i);
                ctrl++;
            }
            if(ctrl==6){
                System.out.println();
                ctrl=0;
            }
        }
    }
}
