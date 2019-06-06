package com.dingli.test.test;

public class Demo3 {
    public static void main(String[] args){
        System.out.println("将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。\n" +
                "程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：\n" +
                "a)\t如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。\n" +
                "b)\t如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。\n" +
                "c)\t如果n不能被k整除，则用k+1作为k的值,重复执行第一步\n");
        int n = 180;
        StringBuilder str = new StringBuilder(n + "=");
        for (int k = 2 ; k <= n ; k++){
            if (n % k == 0) {
                str.append(k).append(" * ");
                n /= k;
                k = 1;
            }
        }
        System.out.print(str.toString().substring(0,str.length() - 3));
    }

}
