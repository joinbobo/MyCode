package com.dingli.test.testDemo;

public class Demo5 {
    public static void main(String[] args) {
        // 5.	实现两数的互换（要求：不能使用中间变量）
        int a = 5;
        int b = 3;

        a = a ^ b;  //6
        b = a ^ b;  //5
        a = a ^ b;  //3
        System.out.println(a);
        System.out.println(b);

        // a=3 b=5
        a = a - b;  //-2
        b = b + a;  //3
        a = b - a;  //5
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
// ^ 使用二进制转换 异异为1 相同为0    a:0101 b:0011 a^b:0110