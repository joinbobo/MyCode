package com.dingli.test;

public class Test5 {
    public static void main(String[] args){
        fu p = new zi();
        p.fangfa();
    }
}

class fu{
    public void fangfa(){
        System.out.println("这是父类哦");
    }
}
class zi extends fu{
    public void fangfa(){
        System.out.println("你已进入子类！");
        System.out.println("你还在里面");
        super.fangfa();
    }
    public void ff(){
        System.out.println("看你怎么调用！");
        System.out.println("嘻嘻！");

    }
}


