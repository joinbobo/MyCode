package com.dingli.test.test;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        System.out.println("有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个" +
                    "月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？");

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第几个月:");
        int month = sc.nextInt();
        System.out.println("第" + month + "个月，兔子的总数为:" + fun(month));
    }
    private static int fun(int month) {
        if((1 == month)||(2 == month)) {
            return 2;
        } else{
            return (fun(month - 1) + fun(month - 2));
        }
    }

}
