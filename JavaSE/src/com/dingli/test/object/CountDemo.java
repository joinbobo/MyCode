package com.dingli.test.object;

import java.math.BigDecimal;

public class CountDemo {
    public static void main(String[] args){
        System.out.println((20 + 5.3) % 20);

        BigDecimal a = new BigDecimal("25.3");
        BigDecimal b = new BigDecimal("20");
        BigDecimal c = a.remainder(b);
        System.out.println(c);
    }
}
