package com.dingli.test.testDemo;

public class Demo3 {
    public static void main(String[] args) {
        // 3.	试用for循环，计算2+4+6+.....+n的总和。n=100.
        int num = 0;
        for(int i=1; i<=100; i++){
            if(i%2 == 0){
                num = num + i;
            }
        }
        System.out.println("偶数总和：" + num);
    }
}
