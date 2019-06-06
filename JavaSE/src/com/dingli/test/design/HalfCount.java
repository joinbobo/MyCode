package com.dingli.test.design;

public class HalfCount implements Count{
    @Override
    public double count(double price) {
        System.out.println("原价"+price);
        return price * 0.5;
    }
}
