package com.zixue.test.nanDemo;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class Demo1 {
    public static void main(String args[]){
        Random random = new Random();
        float x = random.nextFloat();//产生0.0与1.0之间的一个符点数
        int n = Math.round(20*x);  //构造20以内的一个整数
        long f = 1 ;  //保存阶乘的结果
        int k = 1 ;  //循环变量
        //*********Found********
        do{f*=k;
            k++;
            //*********Found********
        }while(n<f);
        System.out.println(n+"!= "+f);
    }

}
