package com.zixue.test.test;

import java.io.*;
public class Demo9 {
    public static void main(String[ ] args) throws IOException {
        InputStreamReader ir;
        BufferedReader in;
        int sum, x;
        String data;
        //*********Found**********
        sum=0;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        System.out.println("请输入5个整数：");
        //*********Found**********
        for (int i = 1; i<=5; i++) {
            data = in.readLine();
            x = Integer.parseInt(data);
            //*********Found**********
            if (x%2==0)
                sum += x;
        }
        System.out.println("偶数之和为"+ sum );
    }
}
