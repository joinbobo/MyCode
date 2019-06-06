package com.dingli.test.design;

public class Demo1 {
    public static void main(String[] args) {
        double price = 199;
        double rs = rs(new HalfCount(),price);
        System.out.println("现价"+rs);
    }

    public static double rs(Count count,double price){
        return count.count(price);
    }
}
