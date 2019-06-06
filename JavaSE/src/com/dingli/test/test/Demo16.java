package com.dingli.test.test;

import javax.swing.*;
import java.util.Scanner;

/**
 * 16.	输入三个整数x,y,z，请把这三个数由小到大输出。用if语句完成。
 */
public class Demo16 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
        int x,y,z;
        int demp;

        String str;
        str = JOptionPane.showInputDialog("请输入第一个数");
        x = Integer.parseInt (str);
        str = JOptionPane.showInputDialog("请输入第二个数");
        y = Integer.parseInt (str);
        str = JOptionPane.showInputDialog("请输入第三个数");
        z = Integer.parseInt (str);

        if(x>y){
            demp = x;
            x = y;
            y = demp;
        }
        if(y>z){
            demp = y;
            y = z;
            z= demp;
        }
        if(x>y){
            demp = x;
            x = y;
            y = demp;
        }

        System.out.println(x+" "+y+" "+z);

    }
}
