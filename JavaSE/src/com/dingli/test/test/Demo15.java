package com.dingli.test.test;

/**
 * 15.	一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Demo15 {
    public static void main(String[] args) {
        int a = 100;
        int b;
        int sum = 0;
        int demp;
        for(int i=0; i<10; i++){
            a = a/2;
            sum = sum + a;
            System.out.println(a);
        }
        System.out.println("共经过 "+sum);
        System.out.println("第十次反弹似乎不成立，自七次后都是反弹 0");
    }
}
