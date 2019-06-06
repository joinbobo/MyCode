package com.dingli.test.test;

public class Demo12 {
    public static void main(String[] args) {
        int m = 8;
        int n = 10;
        if(m > n){
            int temp = m;
            m = n;
            n = temp;
        }

        int rs = -1;
        while((rs = n % m) != 0){
            n = m;
            m = rs;
        }
        System.out.println("n和m最大公约数"+m);
    }
}
