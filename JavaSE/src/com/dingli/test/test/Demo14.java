package com.dingli.test.test;

import java.util.Scanner;

// 14.	求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = sc.nextInt();
        System.out.println("请输入b的值（相加几个值）");
        int b = sc.nextInt();

        int s = 0; //总数
        int demp = 0; //上次相加的数
        for(int i=1; i<=b; i++){
            demp = demp*10 + a;
            s = demp + s;
        }

        System.out.println(s);
    }
}
